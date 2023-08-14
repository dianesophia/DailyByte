import java.util.*;

class ListNode{
   int val;
   ListNode next;
   ListNode(int x){
      next = null;
      val = x;
   }
}

public class ContainsCycle{
   public static boolean hasCycle(ListNode head){
      if(head == null)
         return false;
      ListNode slow = head;
      ListNode fast = head.next;
       
      while(slow != fast){
         if(fast == null || fast.next == null)
            return false;
           
         slow = slow.next;
         fast = fast.next.next;
      }
      return true;
   }
  
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Enter the number of elements in the list: ");
      int n = sc.nextInt();
      ListNode list1 = new ListNode(0);
      ListNode current1 = list1;
   
      System.out.println("Enter the elements of the sorted list:");
      for (int i = 0; i < n; i++) {
         System.out.print("Enter element: ");
         int val = sc.nextInt();
         current1.next = new ListNode(val);
         current1 = current1.next;
      }   
      
      current1.next = list1; 
      System.out.println("Answer : " + hasCycle(list1));
   }
}