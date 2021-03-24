public class ToyFactory {
    Toy toy;

    public ToyFactory(Toy toy) {
        this.toy = toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    Toy copyToy() {
        return (Toy) toy.copy();
    }
}
