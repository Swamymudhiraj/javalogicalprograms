//write a java program to print the sum of n natural numbers using while loop.
import java.util.Scanner;
class Sumofnnaturalnum{
  public static void main(String args[]){
    int i=1,sum=0;
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    while(i<=n){
      sum=sum+i;
      i++;
    }
    System.out.println("the sum of n natural numbers is"+sum);
  }
}