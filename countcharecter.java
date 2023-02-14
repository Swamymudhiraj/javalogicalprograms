// Write a JAVAprogram to count total number of vowels and consonants in a string. 
import java.util.Scanner;
class countcharecter
  {
 public static void main(String args[])
{
      String str;
      int vowels=0;
      int conso=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string:");
      str=sc.nextLine();
     for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
         vowels++;
       }
       else {
         conso++;
       }
     }
    System.out.println("the count of vowels is:"+vowels);
    System.out.println("the count of consonents is:"+conso);
}
  }