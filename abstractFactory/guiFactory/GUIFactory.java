package abstractFactory.guiFactory;

import abstractFactory.button.Button;
import abstractFactory.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
