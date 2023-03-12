package windows;

import annotation.FindByParametrised;
import htmlelements.MatButton;
import htmlelements.MatInputText;
import htmlelements.MatTextArea;

public class InfoWindow {

    @FindByParametrised(param1 = "Наименование прейскуранта")
    public MatInputText name;

    @FindByParametrised(param1 = "Период действия")
    public MatInputText period;

    @FindByParametrised(param1 = "Дата активации")
    public MatInputText activationDate;

    @FindByParametrised(param1 = "Наименование файла")
    public MatInputText fileName;

    @FindByParametrised(param1 = "Комментарий")
    public MatTextArea comment;

    @FindByParametrised(param1 = "ОК",
            param2 = "")
    public MatButton okButton;
}
