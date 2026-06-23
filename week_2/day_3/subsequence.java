class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i = 0; // pointer for s
        int j = 0; // pointer for t

        while (i < s.length() && j < t.length()) {
            
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        // If all characters of s are found in t
        return i == s.length();
    }
}