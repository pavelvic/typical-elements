package htmlelements;

import annotation.FindByParametrised;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindByParametrised(xpath = ".//label[contains(@class, '%s') and contains(text(), '%s')]")
public class MatLabelTextarea extends HtmlElement {

    @FindBy(xpath = ".//following-sibling::textarea[1]")
    private HtmlElement area;

    public boolean isEnabled() {
        return area.isEnabled();
    }

    public String getText() {
        return area.getAttribute("value");
    }

    public void setText(String text) {
        area.getWrappedElement().clear();
        area.sendKeys(text);
    }

    @Override
    public void clear() {
        area.sendKeys(Keys.CONTROL+"a", Keys.BACK_SPACE);
    }

    public String getLabel() {
        return this.getText();
    }
}