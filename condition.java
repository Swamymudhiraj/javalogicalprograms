// write a java program to find the biggest value of two numbers using conditional statements
import java.util.Scanner;
class condition
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of a:");
      a=sc.nextInt();
      System.out.println("enter the value of b:");
      b= sc.nextInt();
      if (a>b){
        System.out.println("a is big");
      }
      else{
        System.out.println("b is big");
      }
      
    }
  }