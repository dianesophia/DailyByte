import java.util.*;
/*
   Input :
      jewels = abc
      stones = ac
      
   Output:
       2 (ac)
*/
public class JewelsAndStones{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      Set<Character> set = new HashSet<>();
      int counter = 0;
    
      System.out.print("Enter the jewels: ");
      String jewels = sc.nextLine();
    
      System.out.print("Enter the stones: ");
      String stones = sc.nextLine();
    
      for(char ch : jewels.toCharArray()){
         if(!set.contains(ch))
            set.add(ch);
      }
    
      for(char c : stones.toCharArray()){
         if(set.contains(c))
            counter++;
      }
    
      System.out.println("Number of stones that is also jewels : " + counter);
    
   }
}