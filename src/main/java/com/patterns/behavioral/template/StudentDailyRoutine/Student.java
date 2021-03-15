public abstract class Student {

    public final void DailyRoutine() {
        wakeUp();
        haveBreakfast();
        visitClasses();
        goHome();
        sleep();
    }

    void wakeUp() {
        System.out.println("Student wakes up");
    }

    void haveBreakfast() {
        System.out.println("Student has breakfast");
    }

    abstract void visitClasses();

    abstract void goHome();

    void sleep() {
        System.out.println("Student sleeps");
    }

}
