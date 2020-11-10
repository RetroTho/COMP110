/*
File: AdditionQuiz
Name: Jacob Yousif
*/

import java.util.*;
public class AdditionQuiz{
   public static void main(String[] args){
      int number1 = (int)(Math.random() * 90 + 10);
      int number2 = (int)(Math.random() * 90 + 10);
      int number3 = (int)(Math.random() * 90 + 10);
      Scanner input = new Scanner(System.in);
      System.out.print("What is " + number1 + "+" + number2 + "+" + number3 + "? ");
      int answer = input.nextInt();
      boolean result = (answer == (number1+number2+number3));
      
      System.out.println(number1 + "+" + number2 + "+" + number3 + " is " + result);
   }
}