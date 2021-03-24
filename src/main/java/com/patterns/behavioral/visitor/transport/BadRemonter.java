public class BadRemonter implements Remonter {
    @Override
    public void fix(Bus bus) {
        System.out.println("Bus isn't fixed");
    }

    @Override
    public void fix(Plane plane) {
        System.out.println("Plane isn't fixed");
    }

    @Override
    public void fix(Train train) {
        System.out.println("Train isn't fixed");
    }

    @Override
    public void fix(TransportClass transportClass) {
        System.out.println("All transport isn't fixed");
    }
}
