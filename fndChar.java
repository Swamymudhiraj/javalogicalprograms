// find the caharecter in given string charAt():-
import java.util.Scanner;
class fndChar{
  public static void main(String args[]){
    String str;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the sting :");
    str=sc.nextLine();
    System.out.println("3rd position in given string is:"+str.charAt(2));
    System.out.println("5th position in given string is:"+str.charAt(3));
  }
}
