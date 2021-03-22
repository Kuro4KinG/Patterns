public class BuilderRunner {
    public static void main(String[] args) {
        Director director=new Director();

        director.setBuilder(new CastleBuilder());
        House house= director.buildHouse();

        System.out.println(house);
    }
}
