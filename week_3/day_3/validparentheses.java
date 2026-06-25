import java.util.Stack;

public class validparentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets ko stack me add karo
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets check karo
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        validparentheses obj = new validparentheses();

        String s = "({[]})";

        System.out.println(obj.isValid(s));
    }
}