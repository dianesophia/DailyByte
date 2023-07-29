import java.util.*;
/*
   Input  : LR
   Output : True
   
   Input : URURD
   Output: false 
*/

public class VacuumCleanerRoute{
   public static void main(String ...args){
   
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the commands: ");
      String command = sc.nextLine();
      int rl = 0,  du = 0;
      
      for(char ch : command.toCharArray()){
         switch(ch){
            case 'R' : rl++; 
               break;
            case 'L' : rl--; 
               break;
            case 'D' : du++; 
               break;
            case 'U' : du--; 
               break;        
         }
      }
            
      if(rl == 0 && du == 0)
         System.out.println("True");
      else
         System.out.println("False");
      
   }
}