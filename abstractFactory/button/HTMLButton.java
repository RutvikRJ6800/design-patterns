package abstractFactory.button;

public class HTMLButton implements Button {
    @Override
    public void paint() {
        System.out.println("HTMLButton clicked.");
    }
}
