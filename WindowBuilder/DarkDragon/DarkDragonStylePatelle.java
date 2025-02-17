package DarkDragon;

import java.util.function.Function;
import javax.swing.JSlider;

import ThemeSetup.Palettes.StylePalette;

public class DarkDragonStylePatelle implements StylePalette {
    private static final DarkDragonStylePatelle instance = new DarkDragonStylePatelle();

    private DarkDragonStylePatelle() {}

    public static DarkDragonStylePatelle getInstance() {
        return instance;
    }

    public int getBorderRadius() {
        return 1;
    }

    public int getBorderThickness() {
        return 1;
    }

    public int getLeftRightPadding() {
        return 4;
    }

    public int getTopBottomPadding() {
        return 3;
    }

    public int getSideTextAreaPadding() {
        return 5;
    }

    public int getSliderTrackFillingRadius() {
        return 3;
    }

    // TODO: this is not changing anything
    public int getScrollBarThumbBorderRadius() {
        return 1;
    }

    public Function<JSlider, Integer> getTrackHeight() {
        return slider -> slider.getHeight() / 3;
    }

    public Function<JSlider, Integer> getThumbHeight() {
        return slider -> slider.getHeight() / 2;
    }

    private int scrollBarThickness = 15;

    public int getScrollBarThickness() {
        return scrollBarThickness;
    }

    public void updateScrollBarThickness(int value) {
        scrollBarThickness = value;
    }

    public int getListElementsSeparatorThickness() {
        return 1;
    }
}