public class PlayerRunner {
    public static void main(String[] args) {
        Player player = new Player();
        PlayerRemote playerRemote = new PlayerRemote(
                new PlayCommand(player),
                new StopCommand(player),
                new PauseCommand(player)
        );

        playerRemote.playMusic();
        playerRemote.pauseMusic();
        playerRemote.playMusic();
        playerRemote.stopMusic();
    }
}
