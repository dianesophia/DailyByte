import java.util.*;

public class IntersectionOfNumbers{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      Map<Integer, Integer> map = new HashMap<>();
      List<Integer> list = new ArrayList<>();
      
      System.out.print("Enter the size of the first array: ");
      int size1 = sc.nextInt();
      int[] arr1 = new int[size1];
      for(int i = 0; i < size1; i++){
         System.out.print("Enter the number : ");
         arr1[i] = sc.nextInt();
         map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
      }
      
      
      System.out.print("Enter the size of the second array: ");
      int size2 = sc.nextInt();
      int[] arr2 = new int[size1];
      for(int i = 0; i < size2; i++){
         System.out.print("Enter the number : ");
         arr2[i] = sc.nextInt();
         if(map.containsKey(arr2[i]))
            list.add(arr2[i]);
      }
      
      System.out.print("The answer are : { ");
      int[] ans = new int[list.size()];
      for(int j = 0; j < list.size(); j++){
         ans[j] = list.get(j);
         System.out.print(ans[j]);
         if(j < list.size() && j != list.size()-1)
            System.out.print(" , ");
      }
      System.out.print(" }");
      
   }
}