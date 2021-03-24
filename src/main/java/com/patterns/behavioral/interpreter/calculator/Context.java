import static java.lang.Character.isDigit;

public class Context {
    Expression calculate(String str) {
        int position = str.length() - 1;

        while (position > 0) {
            if (isDigit(str.charAt(position))) {
                position--;
            } else {
                Expression left = calculate(str.substring(0, position));
                Expression right = new NumberExpression(Integer.valueOf(str.substring(position + 1), str.length()));
                char operator = str.charAt(position);
                switch (operator) {
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left, right);
                }
            }
        }
        int result = Integer.parseInt(str);
        return new NumberExpression(result);
    }
}
