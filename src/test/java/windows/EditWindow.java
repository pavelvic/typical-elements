package windows;

import annotation.FindByParametrised;
import htmlelements.MatButton;
import htmlelements.MatLabelInput;
import htmlelements.MatLabelTextarea;
import htmlelements.MatTooltipInfoGroup;

public class EditWindow {

    @FindByParametrised(param1 = "Сохранить",
            param2 = "")
    public MatButton saveButton;

    @FindByParametrised(param1 = "edit-index-modal__form-field",
            param2 = "Цеп. темп прироста ADE, %")
    public MatLabelInput incrementIndexADE;

    @FindByParametrised(param1 = "",
            param2 = "Обоснование")
    public MatLabelTextarea comment;

    @FindByParametrised(param1 = "app-index-info",
            param2 = "Баз. темп прироста рынка, %")
    public MatTooltipInfoGroup basicIndexMarket;

    @FindByParametrised(param1 = "app-index-info",
            param2 = "Цеп. темп прироста рынка, %")
    public MatTooltipInfoGroup incrementIndexMarket;

    @FindByParametrised(param1 = "app-index-info",
            param2 = "Баз. темп прироста ADE, %")
    public MatTooltipInfoGroup basicIndexADE;

    @FindByParametrised(param1 = "app-index-info",
            param2 = " Рекомендуемый цеп. ")
    public MatTooltipInfoGroup recommendedIncrementIndex;

    @FindByParametrised(param1 = "app-index-info",
            param2 = "Тип расчёта")
    public MatTooltipInfoGroup calcType;
}
