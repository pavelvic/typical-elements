package htmlelements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Calendar;

public class MatInputDate extends HtmlElement {

    @FindBy(xpath = ".//p")
    private HtmlElement label;

    @FindBy(xpath = ".//input[@formcontrolname and @type = 'text']")
    private HtmlElement input;

    private String dateFormat = "dd.MM.yyyy";

    private Locale locale = Locale.getDefault();

    private Calendar calendar = Calendar.getInstance();

    public boolean isEnabled() {
        return !Objects.nonNull(input.getAttribute("readonly"));
    }

    public String getText() {
        return input.getAttribute("value");
    }

    public void setText(String text) {
        input.clear();
        input.sendKeys(text);
    }

    public String getLabelText() {
        return label.getText();
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getDateFormat() {
        return this.dateFormat;
    }

    public void setDate(Date date) {
        setText(new SimpleDateFormat(dateFormat, locale).format(date));
    }

    public Date getDate() throws ParseException {
        return new SimpleDateFormat().parse(getText());
    }
}