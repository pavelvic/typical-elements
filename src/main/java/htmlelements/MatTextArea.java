package htmlelements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.Objects;

public class MatTextArea extends MatInputText {

    @FindBy(xpath = ".//textarea[@formcontrolname]")
    private HtmlElement input;

    @Override
    public void setText(String text) {
        input.clear();
        input.sendKeys(text);
    }

    @Override
    public String getText() {
        return input.getAttribute("value");
    }

    @Override
    public boolean isEnabled() {
        return !Objects.nonNull(input.getAttribute("readonly"));
    }
}