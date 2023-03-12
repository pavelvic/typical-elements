package htmlelements;

import annotation.FindByParametrised;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.Objects;

@FindByParametrised(xpath = ".//p[text() = '%s']/..")
public class MatInputText extends HtmlElement {

    @FindBy(xpath = ".//p")
    private HtmlElement label;

    @FindBy(xpath = ".//input[@formcontrolname and @type = 'text']")
    private HtmlElement input;


    public boolean isEnabled() {
        return !Objects.nonNull(input.getAttribute("readonly"));
    }

    public String getText() {
        return input.getAttribute("value");
    }

    public void setText(String text) {
        input.clear();
        input.sendKeys(text);
    }

    public String getLabel() {
        return label.getText();
    }
}
