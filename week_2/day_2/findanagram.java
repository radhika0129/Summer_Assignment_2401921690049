import java.util.*;

class findanagram {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Count characters of p
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        int windowSize = p.length();

        // First window
        for (int i = 0; i < windowSize; i++) {
            windowCount[s.charAt(i) - 'a']++;
        }

        if (isSame(pCount, windowCount)) {
            result.add(0);
        }

        // Sliding window
        for (int i = windowSize; i < s.length(); i++) {

            // Add new character
            windowCount[s.charAt(i) - 'a']++;

            // Remove old character
            windowCount[s.charAt(i - windowSize) - 'a']--;

            if (isSame(pCount, windowCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    private boolean isSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}