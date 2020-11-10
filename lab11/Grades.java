/*
File: Grades
Name: Jacob Yousif
*/

import java.util.*;
public class Grades{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter number of students: ");
      int studentNum = input.nextInt();
      
      int[] scores = new int[studentNum];
      
      System.out.print("Enter the scores (all on one line): ");
      for(int i = 0; i <= scores.length - 1; i++){
         scores[i] = input.nextInt();
      }
      
      int highest = scores[0];
      
      for(int i = 1; i <= scores.length - 1; i++){
         if(scores[i] > highest){
            highest = scores[i];
         }
      }  
      
      String[] letters = new String[studentNum];
      
      for(int i = 0; i <= scores.length - 1; i++){
         if(scores[i] > highest - 10){
            letters[i] = "A";
         }
         else if(scores[i] >= highest - 20){
            letters[i] = "B";
         }
         else if(scores[i] >= highest - 30){
            letters[i] = "C";
         }
         else if(scores[i] >= highest - 40){
            letters[i] = "D";
         }
         else{
            letters[i] = "F";
         }
      }
      
      for(int i = 0; i <= scores.length - 1; i++){
         System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + letters[i]);
      }
   }
}