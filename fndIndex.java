// find the index value of charecter in a given string:
import java.util.Scanner;
class fndIndex{
  public static void main(String args[]){
    String str;
    String n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    str=sc.nextLine();
    System.out.println("Enter the charecter:");
     n=sc.nextLine();
    System.out.println("the 3rd charecter position is:"+str.indexOf(n));
  }
}