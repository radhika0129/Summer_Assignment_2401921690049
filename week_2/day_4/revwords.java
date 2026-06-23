class revwords {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            
            StringBuilder word = new StringBuilder(words[i]);
            word.reverse();

            result.append(word);

            // Add space between words
            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}