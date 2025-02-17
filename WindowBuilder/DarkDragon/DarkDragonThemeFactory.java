package DarkDragon;

import ThemeSetup.Theme;
import ThemeSetup.Palettes.ColorPalette;
import ThemeSetup.Palettes.FontPalette;
import ThemeSetup.Palettes.StylePalette;

public class DarkDragonThemeFactory implements Theme {
    public ColorPalette getColorPalette() {
        return DarkDragonColorPalette.getInstance();
    }

    public FontPalette getFontPalette() {
        return DarkDragonFontFactory.getInstance();
    }

    public StylePalette getStylePalette() {
        return DarkDragonStylePatelle.getInstance();
    }
}
