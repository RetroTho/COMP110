/*
File: Count
Name: Jacob Yousif
*/

public class Count{
   public static void main(String[] args){
      
      int[] counts = new int[10];
      int x;
      int lineCount = 10;
      
      for(int i = 0; i < 100; i++){
         x = (int)(Math.random() * 10);
         if(lineCount == 0){
            System.out.println("");
            lineCount = 10;
         }
         System.out.print(x + " ");
         lineCount--;
         
         counts[x]++;
      }
      System.out.println("");
      
      for(int i = 0; i <= counts.length - 1; i++){
         System.out.println("Count of " + i + " is " + counts[i]);
      }
   }
}