//write a java program to given alphabet is ovel are consonent using conditional statements

import java.util.Scanner;
class condition5
  {
    public static void main(String args[])
    {
     char chr;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the alphabet:");
      chr=sc.next().charAt(0);
      
      if( chr == 'a' || chr == 'e'||chr == 'i' ||chr == 'o'|| chr == 'u'){
        System.out.println("given alphabet is ovel");
      }
      else{
        System.out.println("given alphabet is consonent");
      }
      
    }
  }