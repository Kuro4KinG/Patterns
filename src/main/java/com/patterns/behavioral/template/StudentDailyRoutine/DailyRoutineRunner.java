public class DailyRoutineRunner {
    public static void main(String[] args) {
        StudentProgrammer studentProgrammer = new StudentProgrammer();
        StudentEconomist studentEconomist = new StudentEconomist();

        System.out.println("Student Programmer's daily routine... ");
        studentProgrammer.DailyRoutine();
        System.out.println("\nStudent Economist's daily routine... ");
        studentEconomist.DailyRoutine();
    }
}
