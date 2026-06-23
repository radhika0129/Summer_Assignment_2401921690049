class compress {
    public int compressChars(char[] chars) {
        
        int write = 0; // position to write compressed string
        int read = 0;

        while (read < chars.length) {
            
            char current = chars[read];
            int count = 0;

            // Count repeating characters
            while (read < chars.length && chars[read] == current) {
                count++;
                read++;
            }

            // Write character
            chars[write++] = current;

            // Write count if greater than 1
            if (count > 1) {
                String num = String.valueOf(count);

                for (char ch : num.toCharArray()) {
                    chars[write++] = ch;
                }
            }
        }

        return write;
    }
}