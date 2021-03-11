public class PlayerRemote {
    Command play;
    Command stop;
    Command pause;

    public PlayerRemote(Command play, Command stop, Command pause) {
        this.play = play;
        this.stop = stop;
        this.pause = pause;
    }

    void playMusic() {
        play.execute();
    }

    void stopMusic() {
        stop.execute();
    }

    void pauseMusic() {
        pause.execute();
    }
}
