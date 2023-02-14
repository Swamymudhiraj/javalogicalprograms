import java.util.Scanner;
class convertcase{
  public static void main(String args[])
  {
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string value:");
    str=sc.nextLine();
    System.out.println("convertion of lower to upper case is:"+str.toUpperCase());
  }
}