public class StudentProgrammer extends Student {
    @Override
    public void visitClasses() {
        System.out.println("Student visits programming classes");
    }

    @Override
    public void goHome() {
        System.out.println("Student is walking home");
    }
}
