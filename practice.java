//write a java program to find the given number is positive or negative or zero.
import java.util.Scanner;
class practice
  {
    public static void main(String args[])
    {
      int x,y,z;
     Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of x:");
      x=sc.nextInt();
      if(x>=0){
        if(x==0)
        System.out.println("the value is equal to zero");
        else 
            System.out.println("the value is positive");
      }
      else {
        if(x<0)
     System.out.println("the value is negative");
      }
   }
  }