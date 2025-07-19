package abstractfactory;

import abstractfactory.button.Button;
import abstractfactory.checkbox.CheckBox;
import abstractfactory.guifactory.GUIFactory;
import abstractfactory.guifactory.HTMLGUIFactory;
import abstractfactory.guifactory.LinuxGUIFactory;

import java.util.Scanner;

public class AbstractFactory {
    private static GUIFactory guiFactory;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }


    private static void configure() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select your system.");
        System.out.println("""
                1. Linux\s
                2. Web
                Please enter you choice..""");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                guiFactory = new LinuxGUIFactory();
                break;
            case 2:
                guiFactory = new HTMLGUIFactory();
                break;
            default:
                System.out.println("Your choice did not match with available option so going with Linux");
                guiFactory = new LinuxGUIFactory();
                break;
        }
    }


    private static void runBusinessLogic() {
        if (guiFactory != null) {
            Button button = guiFactory.createButton();
            CheckBox checkBox = guiFactory.createCheckBox();

            button.paint();
            checkBox.paint();
        }
    }
}
