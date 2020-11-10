/*
File: MyDate
Name: Jacob Yousif
*/

import java.util.*;
public class MyDate{
   private int year;
   private int month;
   private int day;
   
   public MyDate(){
      GregorianCalendar date = new GregorianCalendar();
      year = date.get(GregorianCalendar.YEAR);
      month = date.get(GregorianCalendar.MONTH) + 1;
      day = date.get(GregorianCalendar.DAY_OF_MONTH);

   }
   
   public MyDate(long elapsedTime){   
      GregorianCalendar date = new GregorianCalendar();
      date.setTimeInMillis(elapsedTime);
      year = date.get(GregorianCalendar.YEAR);
      month = date.get(GregorianCalendar.MONTH) + 1;
      day = date.get(GregorianCalendar.DAY_OF_MONTH);
   }
   
   public MyDate(int year, int month, int day){
      this.year = year;
      this.month = month;
      this.day = day;
   }
   
   public int getYear(){
      return year;
   }
   
   public int getMonth(){
      return month;
   }
   
   public int getDay(){
      return day;
   }
   
   public void setYear(int year){
      this.year = year;
   }
   
   public void setMonth(int month){
      this.month = month;
   }
   
   public void setDay(int day){
      this.day = day;
   }
   
   public void setDate(long elapsedTime){
      GregorianCalendar date = new GregorianCalendar();
      date.setTimeInMillis(elapsedTime);
      year = date.get(GregorianCalendar.YEAR);
      month = date.get(GregorianCalendar.MONTH);
      day = date.get(GregorianCalendar.DAY_OF_MONTH);
   }
   
   public String toString(){
      return (String.format("%02d", getMonth()) + "/" + String.format("%02d", getDay()) + "/" + getYear());
   }
}