class StopWordFilteredWordFrequency {

    static void printFilteredWordFrequency(String text) {

        text = text.toLowerCase().replace(".", "").replace(",", "");
        String[] words = text.split("\\s+");

        String[] stop = {"the", "was", "and", "a", "is", "of", "in"};
        String[] unique = new String[words.length];
        int[] count = new int[words.length];
        int n = 0;

        for (String word : words) {

            boolean skip = false;

            for (String s : stop)
                if (word.equals(s)) skip = true;

            if (skip) continue;

            int i;
            for (i = 0; i < n; i++)
                if (unique[i].equals(word)) break;

            if (i < n)
                count[i]++;
            else {
                unique[n] = word;
                count[n++] = 1;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.println(unique[i] + ": " + count[i]);
    }

    public static void main(String[] args) {
        printFilteredWordFrequency(
            "The mentor was great, the session was great and clear."
        );
    }
}