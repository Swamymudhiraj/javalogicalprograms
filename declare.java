//write a java program to find out the area of a circle using methods.
import java.util.Scanner;
class radius

  {
    float pi=3.14f;
    float area;
   void add(int r)
    {
     area = pi*r*r;
      System.out.println("The area of the citcle is: "+area);
    
      
    }
  }
class declare
  {
    public static void main(String []args)
    
    {
      Scanner sc = new Scanner(System.in);
      int r;
      Addition a1 = new Addition();
      System.out.println("Enter the radius of the cricle");
      r=sc.nextInt();
      a1.add(r);
    }
  }
