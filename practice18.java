// write a java program to addition of two numbers using called method & calling method
 import java.util.Scanner;
class Addition{
  int x;
  int add(int a,int b){
    x=a+b;
    //System.out.println("the addition of two numbers is:"+x);
    return x;
  }
  
} 
class practice18{
  public static void main(String args[]){
    int a,b,z;
    Addition ad=new Addition();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values of a,b:");
    a=sc.nextInt();
    b=sc.nextInt();
    z=ad.add(a,b);
    System.out.println("Addition value of two numbers is:"+z);
   
  }
}