// check the given two strings are equal or not
import java.util.Scanner;
class checkequal
  {
 public static void main(String args[])
{
      String str1,str2;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string 1");
       str1=sc.nextLine();
    System.out.println("Enter the string 2");
       str2=sc.nextLine();
     if(str1.equals(str2)){
        System.out.println("the given two strings are equal");
     } 
     else{ 
        System.out.println("the given two strings are not equal");
     }
  }
  }