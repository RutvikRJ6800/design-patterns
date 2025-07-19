package abstractFactory.guiFactory;

import abstractFactory.button.Button;
import abstractFactory.button.HTMLButton;
import abstractFactory.checkbox.CheckBox;
import abstractFactory.checkbox.HTMLCheckBox;


public class HTMLGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new HTMLButton();
    }


    @Override
    public CheckBox createCheckBox() {
        return new HTMLCheckBox();
    }
}
