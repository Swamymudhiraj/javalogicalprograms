// enter the elements and using methods with arguments without return type:
import java.util.*;
class MethodArray2
{
  void arrayMethod(int a[])
  {
  int i,n;
  System.out.println("The Elements in an Array is:");
   for(i=0;i<a.length;i++)
    {
      System.out.print(" "+a[i]);
    }
  }
}
class array7
{
  public static void main(String args[])
  {
    MethodArray2 ma2=new MethodArray2();
     int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Size:");
    n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("Enter Elements to Array:");
   for(i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();
  }
    ma2.arrayMethod(a);
}
}

