package labs.partC;

public class AlgoChallenge {

    public static String missingLetter(String str, int n) {
        if (n < 0 || n >= str.length()) {
            throw new IllegalArgumentException("Invalid index");
        }
        
        String result = str.substring(0, n) + str.substring(n + 1);
        return result;
    }

    public static String wordOfDay(String word) {
        char lastChar = word.charAt(word.length() - 1);
        
        String result = lastChar + word + lastChar;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(missingLetter("kitten", 1));  // Output: "ktten"
        System.out.println(missingLetter("kitten", 0));  // Output: "itten"
        System.out.println(missingLetter("kitten", 4));  // Output: "kittn"

        System.out.println(wordOfDay("cat"));    // Output: "tcatt"
        System.out.println(wordOfDay("Hello"));  // Output: "oHelloo"
        System.out.println(wordOfDay("a"));      // Output: "aaa"
    }
}
