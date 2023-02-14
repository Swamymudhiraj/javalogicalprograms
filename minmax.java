// find the minimum and maxmimum value using arrays and method
import java.util.Scanner;
class MinimumMax
  {
  int i,n,min=0,max=0;
  void minMax(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
      n=sc.nextInt();
     
      int a[]=new int[n];
    System.out.println("Enter Elements to Array :");
    for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        System.out.println("The minimum and maximum values in an Array is:"); 
       min=max=a[0];
    for(i=0;i<n;i++)
    {
      if(a[i]>max){
        max=a[i];
      }
      if(a[i]<min){
        min=a[i];
      }
  } 
      System.out.println("the maximum value of given number is:"+max);
       System.out.println("the minimum value of given number is:"+min);
}
  }
class minmax{
  public static void main(String args[]){
    MinimumMax mm=new MinimumMax();
    mm.minMax();
  }
}
