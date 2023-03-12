package htmlelements;

import annotation.FindByParametrised;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindByParametrised(xpath = "//app-notification-modal//div[contains(@class, '%s')]/parent::div/parent::app-notification-modal")
public class MatNotifModal extends HtmlElement {

    @FindBy(xpath = ".//div[contains(@class, 'notification__header')]")
    private HtmlElement header;

    @FindBy(xpath = ".//div[contains(@class, 'notification__body')]/p")
    private HtmlElement message;

    @FindByParametrised(param1 = "Close",
                        param2 = "")
    private MatButton closeButton;

    public String getText() {
        return message.getText();
    }

    public String getTitle() {
        return header.getText();
    }

    public void close() {
        closeButton.click();
    }
}
