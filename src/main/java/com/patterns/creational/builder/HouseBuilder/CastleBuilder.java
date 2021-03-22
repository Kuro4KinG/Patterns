public class CastleBuilder extends HouseBuilder {

    @Override
    void buildFloorsCount() {
        house.setFloorsCount(15);
    }

    @Override
    void buildHasGarage() {
        house.setHasGarage(true);
    }

    @Override
    void buildPrice() {
        house.setPrice(1000000);
    }
}
