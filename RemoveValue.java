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

public class RemoveValue {
   public ListNode removeElements(ListNode head, int val) {
      while (head != null && head.val == val) {
         head = head.next;
      }
   
      ListNode current = head;
      while (current != null && current.next != null) {
         if (current.next.val == val) {
            current.next = current.next.next;
         } else {
            current = current.next;
         }
      }
   
      return head;
   }

   public static void main(String... args) {
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Enter the number of elements in the list : ");
      int size = sc.nextInt();
   
      // Create a dummy head node to simplify list manipulation
      ListNode dummyHead = new ListNode();
      ListNode current = dummyHead;
   
      for (int i = 0; i < size; i++) {
         System.out.print("Enter the element: ");
         int num = sc.nextInt();
         current.next = new ListNode(num);
         current = current.next;
      }
   
      System.out.print("Enter the value to remove: ");
      int numToRemove = sc.nextInt();
   
      RemoveValue remover = new RemoveValue();
      ListNode listAfter = remover.removeElements(dummyHead.next, numToRemove);
   
      System.out.print("List after removal: ");
      current = listAfter;
      while (current != null) {
         System.out.print(current.val + " ");
         current = current.next;
      }
   }
}
