package abstractfactory.checkbox;

public class LinuxCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Linux checkbox painted");
    }
}
