//  enter the elements and using methods without arguments without return type:
import java.util.*;
class MethodArray1
{
  void arrayMethod()
  {
   int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Size:");
    n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("Enter Elements to Array:");
   for(i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();// 0=10,1=20//2=30//3=40//4=50
  }
  System.out.println("The Elements in an Array is:");
   for(i=0;i<a.length;i++)
    {
      System.out.print(" "+a[i]);//0=10//1=20......
    }
  }
}
class array6
{
  public static void main(String args[])
  {
    MethodArray1 ma1=new MethodArray1();
    ma1.arrayMethod();
}
}

