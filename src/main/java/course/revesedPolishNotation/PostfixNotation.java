package course.revesedPolishNotation;

import java.util.Stack;

/**
 * Polish notation was described in the 1920s by Polish mathematician Jan Lukasiewicz as a logical system for the
 * specification of mathematical equations without parentheses. There are two versions, prefix notation and postfix
 * notation. In prefix notation, the operators are placed before the operand. In postfix notation, this order is
 * reversed. The following example illustrates the two. The asterisk is used for the multiplication sign.
 * <p>
 * Equation with parenthesis       (1 + 2) * 3
 * Prefix notation                 * 3 + 1 2       or      * + 1 2 3
 * Postfix notation                1 2 + 3 *       or      3 1 2 + *
 * Postfix notation has since become known as reverse Polish notation. In the HP implementation of rpn, the ENTER key
 * is pressed between any two numbers that are not separated by an operation.
 *
 * @author trierra
 * @date 3/31/16.
 */
public class PostfixNotation {

    public static Stack<Character> infixToPostfix(String expression) {
        char[] expressionChars = expression.toCharArray();
        Stack<Character> operand = new Stack<Character>();
        Stack<Character> operator = new Stack<Character>();

        for (char item : expressionChars) {
            switch (item) {
                case '(':
                    operator.push(item);
                    break;
                case '*':
                    operator.push(item);
                    break;
                case '/':
                    operator.push(item);
                    break;
                case '+':
                    if (!operand.isEmpty()) {
                        if (operator.peek() == '*' || operand.peek() == '/') {
                            operand.push(operator.pop());
                            operator.push(item);
                        } else {
                            operator.push(item);
                        }
                    } else {
                        operator.push(item);
                    }
                    break;
                case '-':
                    if (!operand.isEmpty()) {
                        if (operator.peek() == '*' || operand.peek() == '/') {
                            operand.push(operator.pop());
                            operator.push(item);
                        } else {
                            operator.push(item);
                        }
                    } else {
                        operator.push(item);
                    }
                    break;
                case ')':
                    while (operator.peek() != '(') {
                        operand.push(operator.pop());
                    }
                    operator.pop();
                    break;
                case ' ':
                    break;

                default:
                    operand.push(item);
            }
        }

        while (!operator.isEmpty()) {
            operand.push(operator.pop());
        }
        return operand;
    }

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (char item : infixToPostfix("(4+5)*6")) {
            builder.append(item);
        }
        if ((!builder.toString().equals("45+6*"))) throw new AssertionError();

        builder = new StringBuilder();
        for (char item : infixToPostfix("(4 + 2 * 5) / (1 + 3 * 2)")) {
            builder.append(item);
        }

        builder = new StringBuilder();
        for (char item : infixToPostfix("(5*7+1-(3-2*2-3))")) {
            builder.append(item);
        }
        System.out.println(builder.toString());
//        if ((!builder.toString().equals("425*+132*+/"))) throw new AssertionError();
    }
}
