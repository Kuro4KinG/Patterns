public class Monoblock extends PhoneType {
    public Monoblock(Model model) {
        super(model);
    }

    @Override
    public void use() {
        System.out.println("Using Monoblock...");
        model.message();
    }
}
