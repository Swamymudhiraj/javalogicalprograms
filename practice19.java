//  methods for even numbers,odd numbers,palindrome number,prime numbne,multiplication table,n natural numbers,sum of n natural numbers,factorial of given number.
import java.util.Scanner;
class Evennumbers{
  int num,r,tem;
  int i=1;
  int fact=1;
  int sum=0;
  Scanner sc=new Scanner(System.in);
  void even(){
     System.out.println("enter the value of n for even numbers:");
    num=sc.nextInt();
    while(i<=num){
      if(i%2==0){
        System.out.println(i);
      }
      i++;
    }
  } 
  void factorial(){
    System.out.println("enter the value of n for factorial:");
    num=sc.nextInt();
    while(num>=1){
      fact=fact*num;
      num--;
    }
    System.out.println("the factorial of given number is:"+fact);
  }
  void palindrome(){
        System.out.println("enter the number for palindrome:");
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
  void multiplicationTable(){
    System.out.println("enter the table:");
    num=sc.nextInt();
    i=1;
    while(i<=10){
     System.out.println(num+"*"+i+"="+num*i);
      i++;
    }
  }
  void primeNumber(){
    System.out.println("enter the value of n for checking prime number or not:");
    num=sc.nextInt();
    int c=0;
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
  void sumofNnaturalnum(){
    System.out.println("enter the value of n for sum of natural numbers:");
    num=sc.nextInt();
    while(i<=num){
      sum=sum+i;
      i++;
    }
    System.out.println("the sum of n natural numbers is"+sum);
  }
  void odd(){
    System.out.println("enter the value of n for odd numbers:");
    num=sc.nextInt();
    i=1;
    while(i<=num){
      if(i%2!=0){
        System.out.println(i);
      }
      i++;
    }
  }
  void nnaturalNum(){
        System.out.println("enter the value of n for natural numbers:");
    num=sc.nextInt();
    i=1;
    while(i<=num){

      System.out.println(i);
      i++;
    }
  }
}
class practice19{
  public static void main(String args[]){
    Evennumbers en=new Evennumbers();
    en.even();
    en.factorial();
    en.palindrome();
    en.multiplicationTable();
    en.primeNumber();
    en.sumofNnaturalnum();
    en.odd();
    en.nnaturalNum();
  }
}