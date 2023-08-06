import java.util.*;
public class ValidAnagram{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      Map<Character, Integer> map= new HashMap<>();
    
      System.out.print("Enter the first word: ");
      String s = sc.nextLine();
      System.out.print("Enter the second word: ");
      String t = sc.nextLine();
    
      for(char ch : s.toCharArray()){
         map.put(ch , map.getOrDefault(ch , 0) + 1);
      }    
    
      for(char c : t.toCharArray()){
         if(map.containsKey(c)){
            if(map.get(c) > 1)
               map.put(c, map.get(c) - 1 );
            else
               map.remove(c);
         }
      }
      
      System.out.print(map.isEmpty() ? "Valid Anagram" : "Invalid Anagram");
      
   }
}