package popups;

import annotation.FindByParametrised;
import htmlelements.MatButton;
import htmlelements.MatLabelInput;
import htmlelements.MatPopupWindow;
import htmlelements.MatSimpleSwitch;

public class SettingsPopup extends MatPopupWindow {

    @FindByParametrised(param1 = "Сохранить",
            param2 = "")
    public MatButton saveButton;

    @FindByParametrised(param1 = "",
            param2 = "settings-popup__button-reset")
    public MatButton resetButton;

    @FindByParametrised(param1 = "Индикация разницы с рынком")
    public MatSimpleSwitch marketDiffSwitch;

    @FindByParametrised(param1 = "settings-popup__allowable-difference",
            param2 = "Допустимая разница, %")
    public MatLabelInput marketDiffValue;

    @FindByParametrised(param1 = "Индикация типа расчёта")
    public MatSimpleSwitch calcTypeSwitch;
}
