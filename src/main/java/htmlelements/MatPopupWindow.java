package htmlelements;

import annotation.FindByParametrised;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindBy(xpath = "//app-popup-container")
public class MatPopupWindow extends HtmlElement {

    @Name("ОТМЕНА")
    @FindByParametrised(param1 = "Отмена",
                        param2 = "")
    public MatButton cancel;

    public void close() {
        cancel.click();
    }
}
