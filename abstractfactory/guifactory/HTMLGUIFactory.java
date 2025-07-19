package abstractfactory.guifactory;

import abstractfactory.button.Button;
import abstractfactory.button.HTMLButton;
import abstractfactory.checkbox.CheckBox;
import abstractfactory.checkbox.HTMLCheckBox;


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
