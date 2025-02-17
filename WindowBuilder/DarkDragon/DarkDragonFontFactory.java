package DarkDragon;

import java.awt.Font;

import ThemeSetup.Palettes.FontPalette;
import ThemeSetup.FontLoader;

public class DarkDragonFontFactory implements FontPalette {
    private static final DarkDragonFontFactory instance = new DarkDragonFontFactory();
    private final String defaultFontPath = "WindowBuilder\\DarkDragon\\Fonts\\readex_pro\\fonts\\ttf\\ReadexPro-Medium.ttf";
    private Font defaultFont;

    private DarkDragonFontFactory() {}

    public static DarkDragonFontFactory getInstance() {
        return instance;
    }

    public int getMinFontSize() {
        return 5;
    }

    // default size is 14, but is usually dynamically changed
    public Font getDefaultFont() {
        if(defaultFont == null) {
            defaultFont = FontLoader.loadFont(defaultFontPath, 14);
            //defaultFont = new Font("Calibri", Font.PLAIN, 14);
        }
        return defaultFont;
    }

    public int getFontSize() {
        return 14;
    }
}
