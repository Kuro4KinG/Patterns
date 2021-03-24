public class InterpretApp {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.calculate("1+2+3-4");
        System.out.println(expression.interpret());
    }
}
