public class RemonterRunner {
    public static void main(String[] args) {
        TransportClass transportClass = new TransportClass();

        GoodRemonter goodRemonter = new GoodRemonter();
        BadRemonter badRemonter = new BadRemonter();

        transportClass.accept(goodRemonter);
        transportClass.accept(badRemonter);
    }
}
