class repeatedsubst {
    public boolean repeatedSubstringPattern(String s) {
        
        int n = s.length();

        // Try every possible substring length
        for (int len = 1; len <= n / 2; len++) {

            // Length should divide the string completely
            if (n % len == 0) {

                String part = s.substring(0, len);
                StringBuilder result = new StringBuilder();

                // Repeat substring
                for (int i = 0; i < n / len; i++) {
                    result.append(part);
                }

                if (result.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}