/*
File: DaysOfMonth
Name: Jacob Yousif
*/

import java.util.*;
public class DaysOfMonth{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter month: ");
      int monthNum = input.nextInt();
      System.out.print("Enter year: ");
      int year = input.nextInt();
      
      int days;
      String month;
      
      switch (monthNum) {
         case 1:  month = "January"; days = 31;
            break;
         case 2:  month = "February"; days = 28;
            break;
         case 3:  month = "March"; days = 31;
            break;
         case 4:  month = "April"; days = 30;
            break;
         case 5:  month = "May"; days = 31;
            break;
         case 6:  month = "June"; days = 30;
            break;
         case 7:  month = "July"; days = 31;
            break;
         case 8:  month = "August"; days = 31;
            break;
         case 9:  month = "September"; days = 30;
            break;
         case 10: month = "October"; days = 31;
            break;
         case 11: month = "November"; days = 30;
            break;
         case 12: month = "December"; days = 31;
            break;
         default: month = "Invalid Input"; days = 0;
            break;
      }
      
      if(monthNum == 2){
         if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            days++;
         }
      }
      
      System.out.println(month + " " + year + " had " + days + " days");
   }
}