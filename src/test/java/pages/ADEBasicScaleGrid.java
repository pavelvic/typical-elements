package pages;

import annotation.FindByParametrised;
import htmlelements.MatDoubleCell;
import htmlelements.MatSelect;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class ADEBasicScaleGrid  {

    @FindByParametrised(param1 = "base-grid-select",
                        param2 = "")
    public MatSelect sizeGroupSelect;

    @Name("Color")
    public MatDoubleCell color_StringCell;

    @Name("IF")
    public MatDoubleCell IF_MatDoubleCell;

    @Name("VVS1")
    public MatDoubleCell VVS1_MatDoubleCell;

    @Name("VVS2")
    public MatDoubleCell VVS2_MatDoubleCell;

    @Name("VS1")
    public MatDoubleCell VS1_MatDoubleCell;

    @Name("VS2")
    public MatDoubleCell VS2_MatDoubleCell;

    @Name("SI1")
    public MatDoubleCell SI1_MatDoubleCell;

    @Name("SI2")
    public MatDoubleCell SI2_MatDoubleCell;

    @Name("I1")
    public MatDoubleCell I1_MatDoubleCell;

    @Name("I2")
    public MatDoubleCell I2_MatDoubleCell;

    @Name("I3")
    public MatDoubleCell I3_MatDoubleCell;
}
