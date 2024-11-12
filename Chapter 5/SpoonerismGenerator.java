import java.util.Scanner;

public class SpoonerismGenerator {

    public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.next();
    }

    public static int getFirstVowelIndex(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    
    public static void run() {
        String firstWord = getWord("Enter the first word: ");
        String secondWord = getWord("Enter the second word: ");

        int firstVowelIndexFirstWord = getFirstVowelIndex(firstWord);
        int firstVowelIndexSecondWord = getFirstVowelIndex(secondWord);

        
        if (firstVowelIndexFirstWord > 0 && firstVowelIndexSecondWord > 0) {
            String initialConsonantsFirstWord = firstWord.substring(0, firstVowelIndexFirstWord);
            String initialConsonantsSecondWord = secondWord.substring(0, firstVowelIndexSecondWord);
            String remainingFirstWord = firstWord.substring(firstVowelIndexFirstWord);
            String remainingSecondWord = secondWord.substring(firstVowelIndexSecondWord);

            String spoonerizedFirstWord = initialConsonantsSecondWord + remainingFirstWord;
            String spoonerizedSecondWord = initialConsonantsFirstWord + remainingSecondWord;

            System.out.println(firstWord + " and " + secondWord + " spoonerized are: " + spoonerizedFirstWord + " " + spoonerizedSecondWord);
        } else {
            System.out.println(firstWord + " and " + secondWord + " are not good words to spoonerize.");
        }
    }

    public static void main(String[] args) {
        run();
    }
}
