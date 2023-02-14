//write a java program to find the given number is prime number or not using loops.
import java.util.Scanner;
class primenum{
  public static void main(String args[]){
    int i=1,c=0;
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    num=sc.nextInt();
    while(i<=num){
      if(num%i==0){
        c++;
      }
      i++;
    }
    if(c==2){
      System.out.println("the given number is prime number ");
    }
    else{
      System.out.println("the given number is not a prime number");
    }
  }
}