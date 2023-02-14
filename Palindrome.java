// write a java program to check palindrome number or not using while loop.
import java.util.Scanner;
class Palindrome{
  public static void main(String args[]){
    int sum=0,r,tem;
    int num;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number:");
    num=sc.nextInt();
    tem=num;
    while(num>0){
      r=num%10;
      sum=sum*10+r;
      num=num/10;
    }
    if(tem==sum){
      System.out.println("the given num is palindrome");
    }
    else {
      System.out.println("the given number is not palindrome number:");
    }
  }
}