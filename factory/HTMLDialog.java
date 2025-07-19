package factory;

class HTMLDialog extends Dialog {

    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
