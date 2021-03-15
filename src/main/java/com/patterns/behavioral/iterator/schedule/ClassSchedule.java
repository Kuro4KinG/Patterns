public class ClassSchedule implements Schedule {
    String[] classes;

    public ClassSchedule(String[] classes) {
        this.classes = classes;
    }

    @Override
    public Iterator createIterator() {
        return new ScheduleIterator(classes);
    }
}
