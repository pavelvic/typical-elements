package htmlelements;

import enums.Color;
import interfaces.IColorMatchable;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class MatDoubleCell extends HtmlElement implements IColorMatchable {

    @FindBy(xpath = ".//span[contains(@class, 'table-double-cell__current-value')]")
    private HtmlElement currentValue;

    @FindBy(xpath = ".//span[contains(@class, 'table-double-cell__prev-value')]")
    private HtmlElement prevValue;

    public String getCurrentText() {
        return currentValue.getText();
    }

    public String getPervText() {
        return prevValue.getAttribute("textContent").trim();
    }

    public double getPervValue() {
        return Double.parseDouble(prevValue.getAttribute("textContent").trim().replace(",","."));
    }

    public double getCurrentValue() {
        return Double.parseDouble(currentValue.getText().replace(",","."));
    }

    public Color getColor() {
        String classAttrValue = this.getAttribute("class");
        if (classAttrValue.contains("table-double-cell_below")) return Color.RED;
        if (classAttrValue.contains("table-double-cell_higher")) return Color.GREEN;
        return Color.COLORLESS;
    }

    public boolean isPrevValueExist() {
        try {
            prevValue.isDisplayed();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
