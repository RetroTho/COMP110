/*
File: Cylinder
Name: Jacob Yousif
Description: Reads in the radius and length of a Cylinder and computes the area and volume.
*/

import java.util.*;
public class Cylinder{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the radius of the cylinder: ");
      double radius = input.nextDouble();
      System.out.print("Enter the length of the cylinder: ");
      double length = input.nextDouble();
      double area = radius * radius * Math.PI;
      double volume = area * length;
      System.out.println("The area of the cylinder is " + area);
      System.out.println("The volume of the cylinder is " + volume);
   }
}