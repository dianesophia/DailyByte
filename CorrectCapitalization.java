import java.util.*;

public class CorrectCapitalization {

   /*
      Input  : USA
      Output : True

      Input : Calvin
      Output: true 

      Input : ompUter
      Output: false

      Input : car
      Output: true  
   */

   public static void main(String... args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String word = sc.nextLine();
   
      boolean allUpper = true; 
      boolean allLower = true; 
      boolean firstLetter = Character.isUpperCase(word.charAt(0));
   
     
      for (int i = 1; i < word.length(); i++) {
         char ch = word.charAt(i);
      
         if (Character.isUpperCase(ch)) {
            allLower = false; 
         } else if (Character.isLowerCase(ch)) {
            allUpper = false;          
         } else {
            allUpper = false;
            allLower = false;
            break;
         }
      }
   
   
      if (allUpper || (firstLetter && allLower)) {
         System.out.println("True");
      } else {
         System.out.println("False");
      }
   }
}
