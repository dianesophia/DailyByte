import java.util.*;

public class LongestCommonPrefix {
   public static void main(String... args) {
      Scanner sc = new Scanner(System.in);
      String[] word = new String[3];
   
      for (int i = 0; i < word.length; i++) {
         System.out.print("Enter the word: ");
         word[i] = sc.nextLine();
      }
   
      String prefix = word[0];
   
      for (int i = 1; i < word.length; i++) {
         while (word[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
         }
      }
      System.out.println("Longest Common Prefix: " + prefix);
   }
}
