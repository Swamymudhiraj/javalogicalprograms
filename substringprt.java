// print the sub string of given string:
import java.util.Scanner;
class substringprt{
  public static void main(String args[]){
    String str;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the sting:");
    str=sc.nextLine();
    System.out.println("the substring of actuval string is:"+str.substring(2));
    System.out.println("the substring of actuval string is:"+str.substring(2,4));
  }
}