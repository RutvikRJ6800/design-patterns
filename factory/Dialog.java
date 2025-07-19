package factory;

abstract class Dialog {
    void renderWindow() {
        System.out.println("Rendering of Dialog is started");

        // Some business logic
        Button button = createButton();
        button.render();
        button.onClick();

        System.out.println("Rendering of Dialog is end");
    }

    abstract Button createButton();
}
