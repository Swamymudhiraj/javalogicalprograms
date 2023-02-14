// write a java program to factorial of a number using do while

import java.util.Scanner;
class factdowhile{
  public static void main(String args[]){
    int fact=1;
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    num=sc.nextInt();
    do{
      fact=fact*num;
       num--;
    }
    while(num>=1);
     System.out.println("the factorial of given number is:"+fact);
  }
}