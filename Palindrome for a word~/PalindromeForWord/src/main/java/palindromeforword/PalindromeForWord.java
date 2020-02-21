package palindromeforword;

import java.util.*;

/**
 *
 * @author Dinesh Nanda
 */
public class PalindromeForWord {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = s.nextLine(); //Dad
        
        word = word.toLowerCase();
        
        String new_word = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            new_word = new_word + c;
        }
        
        if (new_word.equals(word)) {
            System.out.println("Word is palindrome");
        } else {
            System.out.println("Word is not palindrome");
        }
    }
}
