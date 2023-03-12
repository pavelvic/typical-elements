package htmlelements;

import annotation.FindByParametrised;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindByParametrised(xpath = ".//label[contains(@class, '%s') and contains(text(), '%s')]")
public class MatLabelInput extends HtmlElement {

    @FindBy(xpath = ".//following-sibling::input[1]")
    private HtmlElement input;

    public boolean isEnabled() {
        return input.isEnabled();
    }

    public String getText() {
        return input.getAttribute("value");
    }

    public void setText(String text) {
        input.sendKeys(Keys.CONTROL+"a", Keys.BACK_SPACE);
        input.sendKeys(text, Keys.ENTER);
    }

    @Override
    public void clear() {
        input.sendKeys(Keys.CONTROL+"a", Keys.BACK_SPACE);
    }

    public String getLabelText() {
        return this.getAttribute("innerText");
    }

    public Double getValue() {
        String result = this.getText().replaceAll("\\+","")
                .replaceAll(" ","").replaceAll(",",".");
        return Double.parseDouble(result);
    }
}
