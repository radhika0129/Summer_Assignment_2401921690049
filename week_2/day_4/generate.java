import java.util.*;

class generate {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        
        backtrack(result, "", 0, 0, n);
        
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int n) {
        
        // When string length becomes 2*n, add answer
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add opening bracket if available
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // Add closing bracket only if it is valid
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}