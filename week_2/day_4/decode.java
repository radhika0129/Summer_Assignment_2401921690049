import java.util.*;

class decode {
    public String decodeString(String s) {
        
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                // Build number
                num = num * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                // Store current string and count
                countStack.push(num);
                stringStack.push(current);

                num = 0;
                current = new StringBuilder();
            } 
            else if (ch == ']') {
                // Repeat current string
                int repeat = countStack.pop();
                StringBuilder previous = stringStack.pop();

                for (int i = 0; i < repeat; i++) {
                    previous.append(current);
                }

                current = previous;
            } 
            else {
                // Add characters
                current.append(ch);
            }
        }

        return current.toString();
    }
}