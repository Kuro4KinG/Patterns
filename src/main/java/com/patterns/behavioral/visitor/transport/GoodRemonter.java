public class GoodRemonter implements Remonter {
    @Override
    public void fix(Bus bus) {
        System.out.println("Bus is fixed");
    }

    @Override
    public void fix(Plane plane) {
        System.out.println("Plane is fixed");
    }

    @Override
    public void fix(Train train) {
        System.out.println("Train is fixed");
    }

    @Override
    public void fix(TransportClass transportClass) {
        System.out.println("All transport is fixed");
    }
}
