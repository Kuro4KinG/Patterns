public class PlayCommand implements Command{
    Player player;

    public PlayCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}
