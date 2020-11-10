/*
File: DaysOfTheWeek
Name: Jacob Yousif
*/

import java.util.*;
public class DaysOfTheWeek{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter year: (e.g., 2012): ");
      int year = input.nextInt();
      System.out.print("Enter month: 1-12: ");
      int monthNum = input.nextInt();
      System.out.print("Enter the day of the month: 1-31: ");
      int monthDay = input.nextInt();
      
      String dayOfWeek;
      
      if(monthNum < 3){
         monthNum += 12;
         year -= 1;
      }
      
      int j = year / 100;
      int k = year % 100;
      
      int dayNum = ((monthDay + ((26*(monthNum + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7);
      
      switch (dayNum) {
         case 0:  dayOfWeek = "Saturday";
            break;
         case 1:  dayOfWeek = "Sunday";
            break;
         case 2:  dayOfWeek = "Monday";
            break;
         case 3:  dayOfWeek = "Tuesday";
            break;
         case 4:  dayOfWeek = "Wednesday";
            break;
         case 5:  dayOfWeek = "Thursday";
            break;
         case 6:  dayOfWeek = "Friday"; 
            break;
         default: dayOfWeek = "Error";
            break;
      }
      
      System.out.println("The day of the week is " + dayOfWeek);
   }
}