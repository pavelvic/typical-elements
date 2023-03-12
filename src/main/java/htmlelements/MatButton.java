package htmlelements;

import annotation.FindByParametrised;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindByParametrised(xpath = ".//button[contains(text(),'%s') and contains(@class, '%s')]")
public class MatButton extends HtmlElement {

}
