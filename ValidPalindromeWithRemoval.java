import java.util.*;

public class ValidPalindromeWithRemoval {
   public static void main(String... args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String word = sc.nextLine();
      word = word.toLowerCase();
   
      boolean canBePalindrome = canBePalindromeByRemovingOneChar(word);
   
      if (canBePalindrome) {
         System.out.println("True");
      } else {
         System.out.println("False");
      }
   }

   private static boolean canBePalindromeByRemovingOneChar(String word) {
      int left = 0;
      int right = word.length() - 1;
   
      while (left < right) {
         if (word.charAt(left) != word.charAt(right)) {
            return isPalindrome(word, left + 1, right) || isPalindrome(word, left, right - 1);
         }
         left++;
         right--;
      }
   
      return true;  // The word itself is already a palindrome
   }

   private static boolean isPalindrome(String word, int start, int end) {
      while (start < end) {
         if (word.charAt(start) != word.charAt(end)) {
            return false;
         }
         start++;
         end--;
      }
      return true;
   }
}
