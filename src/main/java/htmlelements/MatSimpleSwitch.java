package htmlelements;

import annotation.FindByParametrised;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindByParametrised(xpath = ".//p[contains(text(), '%s')]//following-sibling::app-simple-switch-button[1]")
public class MatSimpleSwitch extends HtmlElement {

    @FindBy(xpath = ".//preceding-sibling::p")
    private HtmlElement label;

    @FindBy(css = "span.simple-switch-button__slider")
    private HtmlElement slider;

    public String getLabelText() {
        return label.getText();
    }

    public HtmlElement getLabel() {
        return label;
    }

    public void switchOn() {
        if (isOff()) slider.click();
    }

    public void switchOff() {
        if (isOn()) slider.click();
    }

    public boolean isOn() {
        return slider.getCssValue("background-color").equals("rgba(97, 180, 221, 1)");
    }

    public boolean isOff() {
        return !isOn();
    }
}
