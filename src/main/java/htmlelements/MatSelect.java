package htmlelements;

import annotation.FindByParametrised;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@FindByParametrised(xpath = ".//app-custom-select[contains(@class, '%s') and contains(@formcontrolname, '%s')]")
public class MatSelect extends HtmlElement {

    @FindBy(xpath = ".//div[@selectcontrol]")
    private HtmlElement input;

    @FindBy(xpath = "//app-custom-select-option")
    private List<WebElement> items;

    private WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void expand() {
        if (isExpanded()) return;
        new Actions(driver)
                .moveToElement(input)
                .click(input)
                .build()
                .perform();
    }

    public void collapse() {
        if (isCollapsed()) return;
        new Actions(driver)
                .moveByOffset(0,0)
                .build()
                .perform();
    }
    public boolean isExpanded() {
        return items.size()>0;
    }

    public boolean isCollapsed() {
        return items.size()==0;
    }

    public void selectByValue(String value) {
        expand();
        items.stream().filter(e->e.getText().trim().equals(value)).findFirst().get().click();
    }

    public List<WebElement> getItems() {
        expand();
        return items;
    }

    public void selectAnyValue() {
        expand();
        items.get(RandomUtils.nextInt(0, this.items.size() - 1)).click();
    }
}
