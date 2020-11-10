/*
File: Person
Name: Jacob Yousif
*/

import java.util.*;
class Person{
   public String name;
   public String address;
   public String phoneNumber;
   public String email;
   
   public Person(){
   }
   
   public Person(String name, String address, String phoneNumber, String email){
      this.name = name;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.email = email;
   }
   
   public String getName(){
      return name;
   }
   
   public String getAddress(){
      return address;
   }
   
   public String getPhoneNumber(){
      return phoneNumber;
   }
   
   public String getEmail(){
      return email;
   }
   
   public void setName(String name){
      this.name = name;
   }
   
   public void setAddress(String address){
      this.address = address;
   }
   
   public void setPhoneNumber(String phoneNumber){
      this.phoneNumber = phoneNumber;
   }
   
   public void setEmail(String email){
      this.email = email;
   }
   
   public String toString(){
      return ("Person Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() + "\nEmail: " + getEmail());
   }
   
}

class Student extends Person{
   public final static int FRESHMAN = 1;
   public final static int SOPHOMORE = 2;
   public final static int JUNIOR = 3;
   public final static int SENIOR = 4;
   public int status;

   public Student(String name, String address, String phoneNumber, String email, int status){
      super(name, address, phoneNumber, email);
      this.status = status;
   }
   
   public void setStatus(int status){
      this.status = status;
   }
   
   public String getStatus(){
      if(status == FRESHMAN){
         return "Freshman";
      }
      else if(status == SOPHOMORE){
         return "Sophomore";
      }
      else if(status == JUNIOR){
         return "Junior";
      }
      else if(status == SENIOR){
         return "Senior";
      }
      return "";
   }
   
   public String toString(){
      return ("Student Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() + "\nEmail: " + getEmail() + "\nStatus: " + getStatus());
   }
}

class Employee extends Person{
   public String office;
   public int salary;
   public MyDate dateHired;
   
   public Employee(){
   }
   
   public Employee(String name, String address, String phoneNumber, String email, String office, int salary, int year, int month, int day){
      super(name, address, phoneNumber, email);
      this.office = office;
      this.salary = salary;
      dateHired = new MyDate(year, month, day);
   }
   
   public void setOffice(String office){
      this.office = office;
   }
   
   public void setSalary(int salary){
      this.salary = salary;
   }
   
   public void setDateHired(int year, int month, int day){
      dateHired = new MyDate(year, month, day);
   }
   
   public String getOffice(){
      return office;
   }
   
   public int getSalary(){
      return salary;
   }
   
   public MyDate getDateHired(){
      return dateHired;
   }
   
   public String toString(){
      return ("Employee Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() + "\nEmail: " + getEmail() + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "\nHire Date: " + getDateHired());
   }
   
}

class Faculty extends Employee{
   public final static int LECTURER = 1;
   public final static int ASSISTANT_PROFESSOR = 2;
   public final static int ASSOCIATE_PROFESSOR = 3;
   public final static int PROFESSOR = 4;
   public String officeHours;
   public int rank;
   
   public Faculty(String name, String address, String phoneNumber, String email, String office, int salary, int year, int month, int day, String officeHours, int rank){
      super(name, address, phoneNumber, email, office, salary, year, month, day);
      this.officeHours = officeHours;
      this.rank = rank;
   }
   
   public void setRank(int rank){
      this.rank = rank;
   }
   
   public String getRank(){
      if(rank == LECTURER){
         return "Lecturer";
      }
      else if(rank == ASSISTANT_PROFESSOR){
         return "Assistant Professor";
      }
      else if(rank == ASSOCIATE_PROFESSOR){
         return "Associate Professor";
      }
      else if(rank == PROFESSOR){
         return "Professor";
      }
      return "";
   }
   
   public String toString(){
      return ("Faculty Employee Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() + "\nEmail: " + getEmail() + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "\nHire Date: " + getDateHired() + "\nOffice Hours: " + officeHours + "\nRank: " + getRank());
   }
}

class Staff extends Employee{
   public String title;
   
   public Staff(String name, String address, String phoneNumber, String email, String office, int salary, int year, int month, int day, String title){
      super(name, address, phoneNumber, email, office, salary, year, month, day);
      this.title = title;
   }
   
   public void setTitle(String title){
      this.title = title;
   }
   
   public String getTitle(){
      return title;
   }
   
   public String toString(){
      return ("Staff Employee Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() + "\nEmail: " + getEmail() + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "\nHire Date: " + getDateHired() + "\nStaff's title is " + getTitle());
   }
   
}