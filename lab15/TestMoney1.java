/*
File: TestMoney1
Name: Jacob Yousif
*/

public class TestMoney1{
   public static void main(String[] args){
      Money m1 = new Money(5, 45);
      Money m2 = new Money(10, 95);
      Money result = m1.add(m2);
      
      System.out.println(m1 + " + " + m2 + " = " + result);
   
      m1 = new Money(10, 45);
      m2 = new Money(5, 95);
      result = m1.subtract(m2);
      
      System.out.println(m1 + " - " + m2 + " = " + result);
   }
}
