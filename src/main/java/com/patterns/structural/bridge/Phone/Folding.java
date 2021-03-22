public class Folding extends PhoneType {

    public Folding(Model model) {
        super(model);
    }

    @Override
    public void use() {
        System.out.println("Using Folding...");
        model.message();
    }
}
