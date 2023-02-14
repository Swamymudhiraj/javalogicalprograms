//Write a program that takes a user's input of two numbers and prints the larger number.
import java.util.Scanner;
class practice5
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the value of a :");
      a=sc.nextInt();
      System.out.println("Enter the value of b:");
      b=sc.nextInt();
      if(a>b){
        System.out.println("a is the big value");
      } 
      else{
        System.out.println("b is the big value");
      }
    }
  }