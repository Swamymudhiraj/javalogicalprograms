// bubble sorting of an array:
import java.util.Scanner;
class sort
  {
    public static void main(String args[])
    {
      int i,j,n,temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size:");
      n=sc.nextInt();
     
      int a[]=new int[n];
        
        System.out.println("Enter Elements to Array :");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        System.out.println("The Elements in an Array before sorting:");   
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" "); 
    }  
      for(i=0;i<n-1;i++){
        for(j=0;j<n-1-i;j++){
          if(a[j]>a[j+1]){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
          }
        }
      }
        System.out.println("The Elements in an Array after sorting:");   
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" "); 
    }  
}
}