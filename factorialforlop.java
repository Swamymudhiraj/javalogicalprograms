// write a java program to find the factorial of a given number using for loop.
import java.util.Scanner;
class factorialforlop{
  public static void main(String args[]){
    int fact;
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of num:");
    num=sc.nextInt();
    for(fact=1;num>=1;num--){
      fact=fact*num;
      }
    System.out.println("the factorial of given number is:"+fact);
  }
}