public class Kata {
    public static int findShort(String s) {
        // Split the string into an array of words
        String[] words = s.split(" ");

        int shortestLength = Integer.MAX_VALUE;

        // Iterate over each word and find the shortest length
        for (String word : words) {
            int length = word.length();
            if (length < shortestLength) {
                shortestLength = length;
            }
        }

        return shortestLength;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        int shortestLength = findShort(input);
        System.out.println("Shortest word length: " + shortestLength);
    }
}