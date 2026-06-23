class ransom{
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] count = new int[26];

        // Count characters available in magazine
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        // Check if ransomNote characters are available
        for (char ch : ransomNote.toCharArray()) {
            count[ch - 'a']--;

            if (count[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}