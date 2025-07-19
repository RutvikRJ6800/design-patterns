package factory;

import java.util.Scanner;

public class FactoryPattern {
    private static Dialog dialog;


    public static void main (String[] args) {
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
                dialog = new LinuxDialog();
                break;
            case 2:
                dialog = new HTMLDialog();
                break;
            default:
                System.out.println("Your choice did not match with available option so going with Linux");
                dialog = new LinuxDialog();
                break;
        }
    }


    private static void runBusinessLogic() {
        if (dialog != null) {
            dialog.renderWindow();
        }
    }
}
