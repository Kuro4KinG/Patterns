

public class ScheduleIterator implements Iterator {
    String[] classes;
    int index;
    int i = 1;

    public ScheduleIterator(String[] classes) {
        this.classes = classes;
    }

    @Override
    public boolean hasNext() {
        return index < classes.length && classes[index] != null;
    }

    @Override
    public String next() {
        return i++ + ". " + classes[index++];
    }
}
