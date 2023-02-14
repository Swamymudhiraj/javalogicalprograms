// write a java program on a person elegible to vote or not using conditional statements

import java.util.Scanner;
class condition1
  {
    public static void main(String args[])
    {
      int age;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of a:");
      age=sc.nextInt();
      
      if (age>=18){
        System.out.println("he/she is elegeble to voting");
      }
      else{
        System.out.println("he/she is not eligeble to voting");
      }
      
    }
  }