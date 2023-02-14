// write a java program to convert the case upper tomlower:
import java.util.Scanner;
class convertcase1{
  public static void main(String args[])
  {
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string value:");
    str=sc.nextLine();
    System.out.println("convertion of upper to lower case is:"+str.toLowerCase());
  }
}