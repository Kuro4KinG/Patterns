public class StopCommand implements Command {
    Player player;

    public StopCommand(Player pLayer) {
        this.player = pLayer;
    }

    @Override
    public void execute() {
        player.stop();

    }
}
