public class TvRunner {
    public static void main(String[] args) {
        TV tv=new TV();
        tv.setChannel(new FirstChannel());

        for (int i = 0; i < 5; i++) {
            tv.play();
            tv.nextChannel();
        }
        System.out.println("-----------------");

        for (int i = 0; i < 5; i++) {
            tv.play();
            tv.previousChannel();
        }
    }
}
