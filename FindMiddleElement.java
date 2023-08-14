import java.util.*;

class ListNode {
   int val;
   ListNode next;

   ListNode() {
   }

   ListNode(int val) {
      this.val = val;
   }

   ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
   }
}

public class FindMiddleElement{
  
   public static ListNode middleNode(ListNode head){
      ListNode pointA = head;
      ListNode pointB = head;
     
      while(pointB != null && pointB.next != null){
         pointA = pointA.next;
         pointB = pointB.next.next;
      }
     
      return pointA;
   }
    
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Enter the number of elements in the list: ");
      int n = sc.nextInt();
      ListNode list1 = new ListNode();
      ListNode current1 = list1;
   
      System.out.println("Enter the elements of the sorted list:");
      for (int i = 0; i < n; i++) {
         System.out.print("Enter element: ");
         int val = sc.nextInt();
         current1.next = new ListNode(val);
         current1 = current1.next;
      }   
      
      System.out.println("The middle element: " + middleNode(list1.next).val);
   }
}