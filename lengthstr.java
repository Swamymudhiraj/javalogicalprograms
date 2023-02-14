//write a java program to find out the length of the string:
import java.util.Scanner;
class lengthstr{
  public static void main(String args[])
  {
    String str;
    int len;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string value:");
    str=sc.nextLine();
    len=str.length();
    System.out.println("the length of the string is:"+len);
  }
}


