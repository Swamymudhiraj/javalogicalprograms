//Write a program that takes three integers as input and checks if they are all equal using nested if statements.

import java.util.Scanner;
class condition12
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      a=sc.nextInt();
      System.out.println("enter the number:");
      b=sc.nextInt();
      System.out.println("enter the number:");
      c=sc.nextInt();
      
      if(a==b){
        if(a==c){
        System.out.println("given numbers are equal");
      }
      else{
        System.out.println("given numbers are not equal");
      }
      }
        else {
        if(c==b){
          System.out.println("The given numbers are equal");
        }
        else {
          System.out.println("the given numbers are not equal");
        }
        }
      
    }
  }