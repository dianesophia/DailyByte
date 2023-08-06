import java.util.*;;

public class FirstUnqueCharacter{
   public static void main(String...args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the word:");
      String word = sc.nextLine();
    
      int[] freq = new int[26];
    
      for(char ch : word.toCharArray()){
         freq[ch - 'a']++;
      } 
      for(int i = 0; i < word.length(); i++){
         if(freq[word.charAt(i) - 'a'] == 1){
            System.out.println("The first unique character : " + i);
            System.exit(0);
         }
         
      }
    
      System.out.println("There is no unique character");
   }
}