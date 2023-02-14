//write a java program to print the employee details.
import java.util.Scanner;
public class employe {
  public static void main(String[] args) {
    int enu;
    String ename;
    float esal;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the employee number: ");
    enu=sc.nextInt();
    System.out.println("Enter the employee name: ");
    ename=sc.next();
    System.out.println("Enter the employee salary: ");
    esal=sc.nextFloat();
    
    System.out.println("enter employe salary is:");
    
    System.out.println("the employee number is "+enu);
    System.out.println("the employee name is "+ename);
    System.out.println("the employee salary is "+esal);
  }
}