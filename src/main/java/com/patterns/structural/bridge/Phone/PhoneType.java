public abstract class PhoneType {
    protected Model model;

    public PhoneType(Model model) {
        this.model = model;
    }

    public abstract void use();
}
