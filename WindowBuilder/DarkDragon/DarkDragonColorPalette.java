package DarkDragon;

import java.awt.Color;

import ThemeSetup.Palettes.ColorPalette;

public class DarkDragonColorPalette implements ColorPalette {
    private static final DarkDragonColorPalette instance = new DarkDragonColorPalette();

    private final Color raspberry = new Color(199, 43, 65);
    private final Color lavender = new Color(254, 240, 255);
    private final Color wine = new Color(128, 8, 53);
    private final Color plum = new Color(82, 3, 50);
    private final Color night = new Color(46, 17, 45);

    private DarkDragonColorPalette() {}

    public static DarkDragonColorPalette getInstance() {
        return instance;
    }

    public Color getDefaultButtonColor() {
        return wine;
    }

    public Color getPressedButtonColor() {
        return plum;
    }

    public Color getBackgroundColor() {
        return night;
    }

    public Color getSelectedListItemColor() {
        return raspberry;
    }

    public Color getDefaultTextColor() {
        return lavender;
    }

    public Color getBorderColor() {
        return lavender;
    }

    public Color getTextAreaColor() {
        return plum;
    }

    public Color getSliderThumbColor() {
        return plum;
    }

    public Color getSliderTrackFilledColor() {
        return raspberry;
    }

    public Color getSliderTrackEmptyColor() {
        return wine;
    }

    public Color getListElementsSeparatorColor() {
        return lavender;
    }
}
