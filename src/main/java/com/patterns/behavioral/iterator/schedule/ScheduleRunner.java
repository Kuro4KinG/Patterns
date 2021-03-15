public class ScheduleRunner {
    public static void main(String[] args) {
        String[] classes = {"Mathematics", "Geometry", "Foreign Languages", "Informatics", "Physics"};
        ClassSchedule classSchedule = new ClassSchedule(classes);

        Iterator scheduleIterator = classSchedule.createIterator();

        System.out.println("Schedule:");

        while (scheduleIterator.hasNext()) {
            System.out.println(scheduleIterator.next());
        }
    }
}
