// write a java program to given variables are equal or not using conditional statements

import java.util.Scanner;
class condition4
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
      
      if (a==b && b==c && c==a){
        System.out.println("given numbers are equal");
      }
      else{
        System.out.println("given numbers are not equal");
      }
      
    }
  }