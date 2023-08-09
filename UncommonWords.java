import java.util.*;

public class UncommonWords{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      Map<String, Integer> map = new HashMap<>();
      List<String> list = new ArrayList<>();
   
      System.out.print("Enter the first sentence: ");
      String sentence1 = sc.nextLine();
      String[] s1 = sentence1.split(" ");
      
      System.out.print("Enter the second sentence: ");
      String sentence2 = sc.nextLine();
      String[] s2 = sentence2.split(" ");
      
      for(String a : s1){
         map.put(a, map.getOrDefault(a, 0) + 1);
      }
      
         
      for(String b : s2){
         map.put(b, map.getOrDefault(b, 0) + 1);
      }
      
      for(String c : map.keySet()){
         if(map.get(c) == 1)
            list.add(c);
      }
      
      String[] ans = list.toArray(new String[list.size()]);
      System.out.print("Uncommon words : { ");
      for(int i = 0; i < ans.length; i++){
         System.out.print(ans[i]);
         if(i < ans.length && i != ans.length-1)
            System.out.print(" , ");
      }
    
      System.out.print(" }");
   }
}