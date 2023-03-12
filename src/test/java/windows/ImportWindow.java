package windows;

import htmlelements.MatButton;
import htmlelements.MatInputFile;
import org.openqa.selenium.support.FindBy;

public class ImportWindow {
    @FindBy(xpath = ".")
    public MatInputFile uploadInput;

    @FindBy(xpath = ".//span[contains(text(),'Загрузить')]//..")
    public MatButton uploadButton;
}