// write a java program to find out the area of circle.
import java.util.Scanner;
class radiuss
{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    double r = sc.nextDouble();
    
    System.out.println("The area of the circle is " + (Math.PI * r * r));
  }
}