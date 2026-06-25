import java.util.*;

public class EvaluateRPN {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+")) {

                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);

            } else if (token.equals("-")) {

                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);

            } else if (token.equals("*")) {

                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);

            } else if (token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);

            } else {

                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }


    public static void main(String[] args) {

        EvaluateRPN obj = new EvaluateRPN();

        String[] tokens = {"2", "1", "+", "3", "*"};

        int result = obj.evalRPN(tokens);

        System.out.println(result);
    }
}