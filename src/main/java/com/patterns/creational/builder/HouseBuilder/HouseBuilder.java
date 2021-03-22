public abstract class HouseBuilder {
    House house;

    void createHouse() {
        house = new House();
    }

    abstract void buildFloorsCount();

    abstract void buildHasGarage();

    abstract void buildPrice();

    House getHouse() {
        return house;
    }

}
