import java.util.*;

class group {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            
            // Count characters
            int[] count = new int[26];

            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }

            // Create unique key
            StringBuilder key = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                key.append(count[i]).append("#");
            }

            // Add string to its anagram group
            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}