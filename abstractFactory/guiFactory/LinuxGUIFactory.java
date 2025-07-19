package abstractFactory.guiFactory;

import abstractFactory.button.Button;
import abstractFactory.button.LinuxButton;
import abstractFactory.checkbox.CheckBox;
import abstractFactory.checkbox.LinuxCheckBox;

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
