public class ProxyFilm implements Film {
    RealFilm realFilm;
    String name;

    public ProxyFilm(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        if (realFilm == null) {
            realFilm = new RealFilm(name);
        }
        realFilm.play();
    }
}
