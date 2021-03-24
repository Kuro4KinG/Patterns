public class GameRun {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        File file = new File();

        game.setLevel("Level 1");
        file.setSave(game.save());
        System.out.println(game);
        Thread.sleep(3000);

        game.setLevel("Level 2");
        System.out.println(game);
        Thread.sleep(3000);

        System.out.println("Загружаем из файла сохраненный уровень...");
        game.load(file.getSave());
        System.out.println(game);

    }
}
