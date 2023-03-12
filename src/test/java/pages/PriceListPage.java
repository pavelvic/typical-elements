package pages;

import annotation.FindByParametrised;
import htmlelements.MatButton;
import htmlelements.MatIndexBox;
import htmlelements.MatLabelInput;
import htmlelements.MatSelect;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class PriceListPage {
    @Name("Ade")
    @FindByParametrised(param1 = "app-ade")
    public ADE_MatTab ADE_MatTab;
    public static class ADE_MatTab {

        @Name("$")
        @FindByParametrised(param1 = "",
                param2 = "ade__switch-table-display")
        public MatButton $Button;

        public MatIndexBox incrementIndex;

        @FindByParametrised(param1 = "ade__pricelist-version-select",
                param2 = "")
        public MatSelect versionSelect;

        @FindByParametrised(param1 = "ade__basic-forms-select",
                param2 = "")
        public MatSelect formSelect;

        @FindByParametrised(param1 = "Цена")
        public MatLabelInput boxPrice;

        @FindByParametrised(param1 = "Цена обратного выкупа")
        public MatLabelInput boxBuybackPrice;

        @Name("Создать")
        @FindByParametrised(param1 = "Создать",
                param2 = "")
        public MatButton createButton;

        @Name("Экспорт")
        @FindByParametrised(param1 = "Экспорт",
                param2 = "")
        public MatButton exportButton;

        @Name("Ввести в действие")
        @FindByParametrised(param1 = "Ввести в действие",
                param2 = "")
        public MatButton enactmentButton;

        @Name("Пересчитать")
        @FindByParametrised(param1 = "",
                param2 = "diamond-box__update-button")
        public MatButton recalcButton;

        @FindByParametrised(param1 = "app-base-grid")
        public ADEBasicScaleGrid basicScale;
    }
}
