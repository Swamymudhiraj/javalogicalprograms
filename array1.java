// take input and print array
import java.util.Scanner;
  public class array1
       {
  public static void main(String[] args)
  {
    int n;
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of array");
      n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<arr.length;i++){
      System.out.println("Enter the element");
      arr[i]=sc.nextInt();
    }
    System.out.println("the elements in array is:");
     for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" "); 
    }  
     /*
     System.out.println("the elements in array is:");
        for(int a: arr){
        System.out.println(a);
       }
    */
  }
}

