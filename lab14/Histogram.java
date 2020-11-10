/*
File: Histogram
Name: Jacob Yousif
*/

import java.util.Scanner;
public class Histogram{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter set size: ");
   
      int[] values = new int[input.nextInt()];
   
      for(int i = 0; i < values.length; i++){
         values[i] = (int)(Math.random() * 100 + 1);
      }    
      
      System.out.println("\nThe Generated List\n");
      
      int count = 0;
      for(int i = 0; i < values.length; i++){
         System.out.printf("%5d", values[i]);
         
         count++;
         
         if(count == 10){
            System.out.println();
            count = 0;
         }
      }
      
      System.out.println("\nThe Frequency Distribution\n");
      
      int tempFreq = 0;
      int[] frequency = new int[10];
      
      for(int i = 1; i < 100; i += 10){
         System.out.print("range(" + (i / 10) + ") : ");

         for(int j = 0; j < values.length; j++){
            if((values[j] >= i) && (values[j] < (i + 10))){
               tempFreq++;
            }
         }
         
         System.out.println(tempFreq);
         frequency[(i / 10)] = tempFreq;
         tempFreq = 0;
      }
      
      System.out.println("\nThe Histogram Chart\n");
      
      for(int i = 1; i < 100; i += 10){
         System.out.printf("%11s", i + " - " + (i + 9) + " | ");
         for(int j = 0; j < ((frequency[(i / 10)]) / 5); j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
}