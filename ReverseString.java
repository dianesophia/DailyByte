import java.util.*;
/*input : the cat
  output: tac eht*/

public class ReverseString{
   public static void main(String...args){
      Scanner sc = new Scanner(System.in);
      StringBuilder reverse = new StringBuilder();
      
      System.out.print("Enter the sentence: ");
      String str = sc.nextLine();
      String[] newStr = str.split(" ");
      
      for(int i = newStr.length-1; i>= 0; i--){
         StringBuilder word = new StringBuilder(newStr[i]);
         String ans = word.reverse().toString();
         reverse.append(ans).append(" ");
      }
      System.out.println(reverse.toString());
      
      
   }
}