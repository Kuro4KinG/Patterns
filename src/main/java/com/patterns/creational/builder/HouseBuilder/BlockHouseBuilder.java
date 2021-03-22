public class BlockHouseBuilder extends HouseBuilder {

    @Override
    void buildFloorsCount() {
        house.setFloorsCount(11);
    }

    @Override
    void buildHasGarage() {
        house.setHasGarage(false);
    }

    @Override
    void buildPrice() {
        house.setPrice(50000);
    }
}
