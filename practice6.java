//Create a program that takes a user's input of three numbers and prints the smallest number.
import java.util.Scanner;
class practice6
  {
    public static void main(String args[])
    {
      int a,b,c;
      int  max=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the a,b,c value:");
      a= sc.nextInt();
      b= sc.nextInt();
      c= sc.nextInt();
      if(a<b)
        max=a;
      if(b<a)
        max=b;
      if(c<max)
        max=c;

      System.out.println("the smallest value is"+max);
      
      
      
    }
  }