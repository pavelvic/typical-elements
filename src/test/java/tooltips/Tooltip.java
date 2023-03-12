package tooltips;

import annotation.FindByParametrised;
import htmlelements.MatTooltipInfoGroup;

public class Tooltip {
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
    public MatTooltipInfoGroup recommendedIncrementIndexADE;

    @FindByParametrised(param1 = "app-index-info",
            param2 = "Тип расчёта")
    public MatTooltipInfoGroup calcType;

    @FindByParametrised(param1 = "app-index-info",
            param2 = "Обоснование")
    public MatTooltipInfoGroup comment;
}
