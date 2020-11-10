/*
File: Pyramid
Name: Jacob Yousif
*/

public class Pyramid{
   public static void main(String[] args){
      
      int rows = 8;
      for (int i = 0; i < rows; i++) {
         for(int x = rows; x > i; x--){
            System.out.printf("%-5s", " ");
         }
		   
         for(int y = 1; y <= Math.pow(2, i); y *= 2){
            System.out.printf("%-5d", y);
         } 
         
         for(int z = (int) Math.pow(2, i - 1); z >= 1; z /= 2){
            System.out.printf("%-5d", z);
         } 
         System.out.println();
      }
   }
}