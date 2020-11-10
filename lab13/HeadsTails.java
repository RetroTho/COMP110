/*
File: HeadsTails
Name: Jacob Yousif
*/

import java.util.Scanner;
public class HeadsTails{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter a number between 0 and 511: ");
   
      int[] nums = decToBin(input.nextInt());
   
      headsOrTails(nums);
   }

   public static int[] decToBin(int dec){
      int[] nums = new int[9];
      for(int i = nums.length - 1; i >= 0 && dec > 0; i--){
         if(dec % 2 == 0){
            nums[i] = 0;
         }
         else{
            nums[i] = 1;
            dec /= 2;
         }
      }
      return nums;
   }
   
   public static void headsOrTails(int[] nums){
      for(int i = 0; i < 9; i++){
         if(nums[i] == 0){
            System.out.print("H ");
         }
         else{
            System.out.print("T ");
         }
         if((i + 1) % 3 == 0){
            System.out.println();
         }
      }
   }
}