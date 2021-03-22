public class House {

    private int floorsCount;
    private boolean hasGarage;

    @Override
    public String toString() {
        return "House{" +
                "floorsCount=" + floorsCount +
                ", hasGarage=" + hasGarage +
                ", price=" + price +
                '}';
    }

    public void setFloorsCount(int floorsCount) {
        this.floorsCount = floorsCount;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;
}
