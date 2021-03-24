public class TransportClass implements Transport {
    Transport[] transports;

    public TransportClass() {
        this.transports = new Transport[]{new Train(), new Bus(), new Plane()};
    }


    @Override
    public void accept(Remonter remonter) {
        for (Transport transport : transports
        ) {
            transport.accept(remonter);
        }
        remonter.fix(this);
    }
}
