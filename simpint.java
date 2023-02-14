//write a java program to find the simple intrest an total amount.
import java.util.Scanner;
class simpint
  {
    public static void main(String args[])
    {
      float p,t,r;
      float si,ta;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the principal amount:");
      p= sc.nextFloat();
      System.out.println("enter the total number of months:");
      t= sc.nextFloat();
      System.out.println("enter the rate of intrest:");
      r= sc.nextFloat();
      si=(p*t*r)/100;
      ta= p+si;
      System.out.println("the simple intrest is :"+si);
      System.out.println("the total amount is:"+ta);
      
    }
  }