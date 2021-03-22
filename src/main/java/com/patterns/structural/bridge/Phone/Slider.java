public class Slider extends PhoneType {
    public Slider(Model model) {
        super(model);
    }

    @Override
    public void use() {
        System.out.println("Using Slider...");
        model.message();
    }
}
