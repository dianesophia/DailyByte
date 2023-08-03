import java.util.*;

public class TwoSum{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      Map<Integer, Integer> map = new HashMap<>();
      int[] array = new int[2];
      int[] ans = new int[2];
      boolean finalAns = false;
   
      System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      System.out.println();
   
      for(int i = 0; i < size; i++){
         System.out.print("Enter number : ");
         arr[i] = sc.nextInt();
      }
      
      System.out.println();
      System.out.print("Enter the target number: ");
      int target = sc.nextInt();
      System.out.println();
       
      System.out.print("Array = { ");
      for(int i = 0; i < size; i++){
         int temp = target - arr[i];
      
         if(map.containsKey(temp)){
            array[0] = i;
            array[1] = map.get(temp);
            finalAns = true;
         }
      
         map.put(arr[i], i);
         System.out.print(arr[i]);
         if (i < size - 1) {
            System.out.print(", ");
         }
      
      }
      System.out.print("} ");
      
      for(int i = 0; i < arr.length; i++){
         for(int j = i + 1; j < arr.length; j++){
            if(arr[i] + arr[j] == target){
               ans[0] = arr[i];
               ans[1] = arr[j];
            }
         }    
      }
      
      System.out.print("\nTarget = " + target);
      System.out.println("\n");
      
      if(finalAns){
         System.out.print(finalAns + "  -  " + "{ " + ans[0] + " + " + ans[1] + " } and "); 
         System.out.print("[ " + array[0] + " , " +  array[1] + " ]");
      }
      else
         System.out.print(finalAns);
   }
}