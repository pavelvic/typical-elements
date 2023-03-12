package htmlelements;


import annotation.FindByParametrised;
import enums.Color;
import interfaces.IColorMatchable;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindByParametrised(xpath = ".//span[contains(@class, 'diamond-box__incrementIndex')]")
public class MatIndexBox extends HtmlElement implements IColorMatchable {

    public Double getValue() {
        String result = this.getText().replaceAll("\\+","")
                .replaceAll(" ","");
        return Double.parseDouble(result);
    }

    @Override
    public Color getColor() {
        return this.getAttribute("class").contains("diamond-box__incrementIndex_calc-manually") ? Color.YELLOW : Color.COLORLESS;
    }

    @Override
    public boolean isEnabled() {
        return !this.getAttribute("class").contains("diamond-box__incrementIndex_disable");
    }
}