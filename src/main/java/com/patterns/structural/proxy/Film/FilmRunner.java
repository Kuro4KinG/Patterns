public class FilmRunner {
    public static void main(String[] args) {
        Film film = new ProxyFilm("Star Wars");
        film.play();
    }
}
