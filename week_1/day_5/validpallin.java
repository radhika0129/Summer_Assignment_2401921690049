class validpallin {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Ignore non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Ignore non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}