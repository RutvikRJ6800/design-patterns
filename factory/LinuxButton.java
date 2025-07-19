package factory;

class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("LinuxButton rendered.");
    }

    @Override
    public void onClick() {
        System.out.println("LinuxButton clicked.");
    }
}
