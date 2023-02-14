// write a java program to Given number is positive or negitive using conditional statements

import java.util.Scanner;
class condition3
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      num=sc.nextInt();
      
      if (num>=0){
        System.out.println("given number is positive");
      }
      else{
        System.out.println("given number is negitive");
      }
      
    }
  }