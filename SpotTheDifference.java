import java.util.*;

public class SpotTheDifference{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      Map<Character, Integer> map = new HashMap<>();
    
      System.out.print("Enter the first word: ");
      String s = sc.nextLine();
      System.out.print("Enter the second word: ");
      String t = sc.nextLine();
    
      for(char ch : s.toCharArray()){
         map.put(ch, map.getOrDefault(ch, 0) + 1);
      }
    
      System.out.print("The letter that was ramdomly added : ");
    
      for(char c : t.toCharArray()){
         if(!map.containsKey(c)){
            System.out.print(c);
            System.exit(0);
         } 
      }
    
      System.out.print(" ");
   }
}