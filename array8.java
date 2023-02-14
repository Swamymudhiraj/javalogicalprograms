// enter the elements and using methods without arguments with return type:
import java.util.*;
class MethodArray3
{
  int[] arrayMethod(int a[],int n)
  {
    int i;
    int m[]=new int[a.length];
   for(i=0;i<a.length;i++)
    {
     m[i]=a[i];
    }
    return m;
  }
  }
class array8
{
  public static void main(String args[])
  {
    MethodArray3 ma3=new MethodArray3();
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
  int s[]=ma3.arrayMethod(a,n);
    System.out.println("The Elements in an Array is:");
   for(i=0;i<a.length;i++)
    {
      System.out.print(" "+s[i]);
    }
    
}
}

