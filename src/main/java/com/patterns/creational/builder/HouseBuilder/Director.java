public class Director {
    HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse() {
        builder.createHouse();
        builder.buildFloorsCount();
        builder.buildHasGarage();
        builder.buildPrice();

        return builder.getHouse();
    }
}
