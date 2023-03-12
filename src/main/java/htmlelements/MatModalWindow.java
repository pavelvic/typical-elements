package htmlelements;

import annotation.FindByParametrised;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindBy(xpath = "//app-modal-container")
public class MatModalWindow extends HtmlElement {

    @FindBy(xpath = ".//app-modal-header")
    public WebElement header;

    @FindBy(xpath = ".//p")
    public WebElement label;

    @FindByParametrised(param1 = "Отмена",
                        param2 = "")
    public MatButton cancel;

    public String getText() {
        return label.getText();
    }

    public String getTitle() {
        return header.getText();
    }

    public void close() {
        cancel.click();
    }
}
