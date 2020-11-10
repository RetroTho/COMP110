/*
File: MergeLists
Name: Jacob Yousif
*/

import java.util.*;
public class MergeLists{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter length of first list: ");
      int list1Size = input.nextInt();
      int[] list1 = generateList(list1Size);
      list1 = sortList(list1);
      System.out.print("List 1 is: ");
      printList(list1);
      
      System.out.print("Enter length of second list: ");
      int list2Size = input.nextInt();
      int[] list2 = generateList(list2Size);
      list2 = sortList(list2);
      System.out.print("List 2 is: ");
      printList(list2);
      
      System.out.print("The merged result is: ");
      printList(merge(list1, list2)); 
      
   }
   public static int[] generateList(int size){
      int[] temp = new int[size];
      for(int i = 0; i <= temp.length - 1; i++){
         temp[i] = (int)(Math.random() * 20 + 1);
      }
      return temp;
   }
   public static int[] sortList(int[] temp){
      for(int i = 0; i < temp.length - 1; i++){
         int min = temp[i];
         int index = i;
         for(int j = i + 1; j < temp.length; j++){
            if(temp[j] < min){
               min = temp[j];
               index = j;
            }
         }
         if(index != i){
            temp[index] = temp[i];
            temp[i] = min;
         }
      }
      return temp;
   }
   public static void printList(int[] temp){
      for(int i = 0; i < temp.length - 1; i++){
         System.out.print(temp[i] + ", ");
      }
      System.out.println(temp[temp.length - 1]);
   }
   public static int[] merge(int[] temp1, int[] temp2){
      int[] result = new int[temp1.length + temp2.length];
		
		int x = 0;
      int y = 0;
      int z = 0;
		
		while(x < temp1.length && y < temp2.length){
			if(temp1[x] < temp2[y]){
				result[z] = temp1[x];
				x++;
				z++;
			} 
			else{
				result[z] = temp2[y];
				y++;
				z++;
			}
		} 
				
		for(x = x; x < temp1.length; x++){
			result[z] = temp1[x];
			z++;
		} 
				
		for(y = y; y < temp2.length; y++){
			result[z] = temp2[y];
			z++;
		} 
			
		return result;
   }
}