package htmlelements;


import annotation.FindByParametrised;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;


@FindByParametrised(xpath = "//app-notification-popup//div[contains(@class, '%s')]")
public class MatNotifPopup extends HtmlElement {

    @FindBy(xpath = ".//div[@class = 'notification-popup__header']")
    private HtmlElement header;

    @FindBy(xpath = ".//div[@class = 'notification-popup__body']//p[@class = 'notification-popup__message']")
    private HtmlElement message;

    @FindByParametrised(param1 = "",
                        param2 = "notification-popup__btn-close")
    private MatButton xButton;

    public String getTitle() {
        return header.getText();
    }

    public String getText() {
        return message.getText();
    }

    public void close() {
        xButton.click();
    }

}
