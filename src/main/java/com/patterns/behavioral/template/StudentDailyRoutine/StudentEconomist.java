public class StudentEconomist extends Student {
    @Override
    public void visitClasses() {
        System.out.println("Student visits economics classes");
    }

    @Override
    public void goHome() {
        System.out.println("Student takes the bus home");
    }
}
