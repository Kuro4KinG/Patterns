public class RealFilm implements Film {
    String name;

    public RealFilm(String name) {
        this.name = name;
        load();
    }

    @Override
    public void play() {
        System.out.println("Film " + name + " is playing...");
    }

    public void load() {
        System.out.println("Film " + name + " is loaded.");
    }

}
