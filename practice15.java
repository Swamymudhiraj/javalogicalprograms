//Write a method called "printMultiplicationTable" that prints the multiplication table for the numbers 1 through 10.
import java.util.Scanner;
class printMultiplicationTable{
  int a;
  Scanner sc=new Scanner(System.in);
  void table(){
  System.out.println("enter the table:");
  a=sc.nextInt();
    if(a>=1 && a<=10){
      System.out.println("your table is");
      System.out.println("-------------");
      System.out.println(a+ "*1=" +a*1);
      System.out.println(a+ "*2=" +a*2);
      System.out.println(a+ "*3=" +a*3);
      System.out.println(a+ "*4=" +a*4);
      System.out.println(a+ "*5=" +a*5);
      System.out.println(a+ "*6=" +a*6);
      System.out.println(a+ "*7=" +a*7);
      System.out.println(a+ "*8=" +a*8);
      System.out.println(a+ "*9=" +a*9);
      System.out.println(a+ "*10=" +a*10);
    }
    else {
      System.out.println("wrong choice");
    }
}
}
 class practice15{
   public static void main(String args[]){
     printMultiplicationTable pmt=new printMultiplicationTable();
     pmt.table();
   }
 }