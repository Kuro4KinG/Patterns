public class PumpRunner {
    public static void main(String[] args) {
//        BallPump ballPump = new Ball();
//        ballPump.pumpUpBall();
//
//        TirePump tirePump = new Tire();
//        tirePump.pumpUpTire();

        TirePump pumpAdapter = new PumpAdapter(new Ball());
        pumpAdapter.pumpUpTire();
    }
}
