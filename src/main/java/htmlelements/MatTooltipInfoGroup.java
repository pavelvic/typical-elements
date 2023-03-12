package htmlelements;

import annotation.FindByParametrised;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindByParametrised(xpath = ".//%s//p[text() = '%s']/..")
public class MatTooltipInfoGroup extends HtmlElement {

    @FindBy(css = "p.index-info__name")
    private HtmlElement name;

    @FindBy(css = "p.index-info__value")
    private HtmlElement value;

    @FindBy(css = "span.index-info__circle")
    private HtmlElement circle;

    public String getLabelText() {
        return name.getText();
    }

    public String getText() {
        return value.getText();
    }

    public Double getValue() {
        return Double.parseDouble(getText().replace("+",""));
    }
}