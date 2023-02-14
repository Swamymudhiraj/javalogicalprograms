//write a java program to find the factorial of agiven number using while. 
import java.util.Scanner;
class Factorial2{
  public static void main(String args[]){
    int fact=1;
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    num=sc.nextInt();
    while(num>=1){
      fact=fact*num;
      num--;
    }
    System.out.println("the factorial of given number is:"+fact);
  }
}