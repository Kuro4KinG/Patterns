public class PumpAdapter implements TirePump {
    BallPump ballPump;

    public PumpAdapter(BallPump ballPump) {
        this.ballPump = ballPump;
    }

    @Override
    public void pumpUpTire() {
        ballPump.pumpUpBall();
    }
}
