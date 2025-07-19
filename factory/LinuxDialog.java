package factory;

class LinuxDialog extends Dialog {

    @Override
    Button createButton() {
        return new LinuxButton();
    }
}
