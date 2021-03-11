public class CupRunner {
    public static void main(String[] args) {
        CupSingleton cs = CupSingleton.getInstance();

        cs.drink();
        cs.fill();

        CupSingleton cs2 = CupSingleton.getInstance();

        cs2.fill();
        cs2.drink();
        cs.drink();
    }
}
