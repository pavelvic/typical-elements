package htmlelements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.io.File;

public class MatInputFile extends HtmlElement {

    @FindBy(css = "input[type='file']")
    private HtmlElement input;

    public void uploadFile(File file) {
        this.input.sendKeys(file.getAbsolutePath());
    }
}
