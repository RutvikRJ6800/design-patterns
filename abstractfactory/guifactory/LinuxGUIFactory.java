package abstractfactory.guifactory;

import abstractfactory.button.Button;
import abstractfactory.button.LinuxButton;
import abstractfactory.checkbox.CheckBox;
import abstractfactory.checkbox.LinuxCheckBox;

public class LinuxGUIFactory implements GUIFactory{
    /**
     * @return Button for Linux
     */
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    /**
     * @return Checkbox for Linux
     */
    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
