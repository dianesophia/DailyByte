import java.util.*;

public class RemoveNthToLastNode {
   public static ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode tempHead = new ListNode(0);
      tempHead.next = head;
   
      ListNode slow = tempHead;
      ListNode fast = tempHead;
   
      for (int i = 1; i <= n + 1; i++) {
         fast = fast.next;
      }
   
      while (fast != null) {
         slow = slow.next;
         fast = fast.next;
      }
   
      slow.next = slow.next.next;
      return tempHead.next;
   }

   public static void main(String[] args) {
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
   
      System.out.print("Enter the value of n: ");
      int num = sc.nextInt();
   
      ListNode listAfter = removeNthFromEnd(list1.next, num);
   
      System.out.print("List after :");
      ListNode current = listAfter;
      while (current != null) {
         System.out.print(current.val + " ");
         current = current.next;
      }
   }
}
