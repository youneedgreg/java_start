package DarkDragon;
import javax.swing.plaf.metal.MetalLookAndFeel;

import ThemeSetup.Elements.*;
import ThemeSetup.Palettes.ColorPalette;

import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;

import ThemeSetup.Theme;

public class DarkDragonLookAndFeel extends MetalLookAndFeel {
    @Override
    protected void initComponentDefaults(UIDefaults defaults) {
        super.initComponentDefaults(defaults);
        ColorPalette palette = DarkDragonColorPalette.getInstance();

        Theme theme = new DarkDragonThemeFactory();

        defaults.put("Panel.background", new ColorUIResource(palette.getBackgroundColor()));

        CustomButton.setTheme(theme);
        defaults.put("ButtonUI", CustomButton.class.getName());

        CustomLabel.setTheme(theme);
        defaults.put("LabelUI", CustomLabel.class.getName());
        
        CustomTextField.setTheme(theme);
        defaults.put("TextFieldUI", CustomTextField.class.getName());
        
        CustomPasswordField.setTheme(theme);
        defaults.put("PasswordFieldUI", CustomPasswordField.class.getName());

        CustomTextArea.setTheme(theme);
        defaults.put("TextAreaUI", CustomTextArea.class.getName());
    
        CustomScrollPane.setTheme(theme);
        defaults.put("ScrollPaneUI", CustomScrollPane.class.getName());
    
        CustomSlider.setTheme(theme);
        defaults.put("SliderUI", CustomSlider.class.getName());
        
        CustomScrollBar.setTheme(theme);
        defaults.put("ScrollBarUI", CustomScrollBar.class.getName());

        CustomCheckBox.setTheme(theme);
        defaults.put("CheckBoxUI", CustomCheckBox.class.getName());
        
        CustomRadioButton.setTheme(theme);
        defaults.put("RadioButtonUI", CustomRadioButton.class.getName());

        CustomList.setTheme(theme);
        defaults.put("ListUI", CustomList.class.getName());

        CustomProgressBar.setTheme(theme);
        defaults.put("ProgressBarUI", CustomProgressBar.class.getName());
    }

    @Override
    public String getName() {
        return "Unicorn Look and Feel";
    }

    @Override
    public String getID() {
        return "Unicorn";
    }

    @Override
    public String getDescription() {
        return "A sweet theme created with the Window Builder Extension for VS Code!";
    }

    @Override
    public boolean isNativeLookAndFeel() {
        return false;
    }

    @Override
    public boolean isSupportedLookAndFeel() {
        return true;
    }
}
