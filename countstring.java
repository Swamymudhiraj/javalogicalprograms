// write a java program to count the character in string
import java.util.Scanner;
class countstring
  {
 public static void main(String args[])
{
      String str;
      int count=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string:");
      str=sc.nextLine();
     for(int i=0;i<str.length();i++){
       count++;
     }
    System.out.println("the count of a string is:"+count);
}
  }

