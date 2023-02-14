// write a java program to reverse a string
import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
        String str;
        Scanner sc = new Scanner(System.in);
      System.out.println("enter the string:");
      str=sc.nextLine();
      StringBuffer st1=new StringBuffer(str);
      System.out.println("The Given String is:"+str);
      System.out.println("The Reverse of the given String is:"+st1.reverse());
}
}