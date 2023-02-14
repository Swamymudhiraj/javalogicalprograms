//Write a JAVAprogram to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
class practice1
  {
    public static void main(String args[])
    {
      int x,c1,c2;
     Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of x:");
      x=sc.nextInt();
     // c1=(x%5);
      //c2=(x%11);
        if(x%5==0){
        if(x%11==0)
        System.out.println("its divisible by both 5 and 11");
        else 
            System.out.println("its divisible by only 5");
      }
      else { 
        if(x%11==0)
     System.out.println("its divisible by 11");
        else
        System.out.println("the number is not divisible by both 5 and 11");
      }
   }
  }