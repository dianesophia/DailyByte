import java.util.*;
/*
   Input  : level
   Output : True
   
   Input : car
   Output: false 
*/

public class ValidPalindrome{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String word = sc.nextLine();
      word = word.toLowerCase();
      
      StringBuilder sb = new StringBuilder();
      for(char letter : word.toCharArray()){
         sb.append(letter);
      }
     
      if((sb.reverse().toString()).equals(word))
         System.out.println("True");
      else
         System.out.println("False");
   }
}