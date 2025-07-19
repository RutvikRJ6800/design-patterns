package abstractFactory.checkbox;

public class HTMLCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("HTML checkbox painted.");
    }
}
