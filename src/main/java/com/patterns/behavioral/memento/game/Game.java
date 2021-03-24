import java.util.Date;

public class Game {
    private String level;
    private Date date;

    public void setLevel(String level) {
        this.level = level;
        date = new Date();
    }

    public void load(Save save) {
        level = save.getLevel();
        date = save.getDate();
    }

    public Save save() {
        return new Save(level, date);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", date=" + date +
                '}';
    }
}

