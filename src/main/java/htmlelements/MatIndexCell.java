package htmlelements;

import enums.Color;
import interfaces.IColorMatchable;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class MatIndexCell extends HtmlElement implements IColorMatchable {

    @FindBy(xpath = ".//span[contains(@class, 'cell-index__value')]")
    private HtmlElement value;

    @FindBy(xpath = ".//span[contains(@class, 'mdi-arrow-up-bold')]")
    private HtmlElement upArrow;

    @FindBy(xpath = ".//span[contains(@class, 'mdi-arrow-down-bold')]")
    private HtmlElement downArrow;

    @FindBy(xpath = ".//span[contains(@class, 'cell-index__edit-icon')]")
    private HtmlElement editIcon;

    @Override
    public String getText() {
        return value.getText();
    }

    public Color getColor() {
        String classAttrValue = value.getAttribute("class");
        if (classAttrValue.contains("cell-index__value_neighbors")) return Color.ORANGE;
        if (classAttrValue.contains("cell-index__value_max-min")) return Color.PINK;
        if (classAttrValue.contains("cell-index__value_manual")) return Color.YELLOW;
        return Color.COLORLESS;
    }

    public Double getValue() {
        String result = value.getText().replaceAll("\\+","")
                .replaceAll(" ","")
                .replaceAll("%","");
        return Double.parseDouble(result);
    }

    public boolean hasEditIcon() {
        return editIcon.getAttribute("class").contains("cell-index__edit-icon_show");
    }

    public boolean hasUpArrow() {
        return upArrow.getAttribute("class").contains("cell-index__arrow-icon_show");
    }

    public boolean hasDownArrow() {
        return downArrow.getAttribute("class").contains("cell-index__arrow-icon_show");
    }
}
