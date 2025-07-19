package abstractFactory.button;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("LinuxButton clicked.");
    }
}
