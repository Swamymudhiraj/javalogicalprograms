// write a java program to find out the product cost and total bill amount.
import java.util.Scanner;
class product
  {
    public static void main(String args[])
    {
      int pno;
      String pnam;
      float pcost,pqty;
      float bamt;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter product number:");
      pno = sc.nextInt();
      System.out.println("Enter product name:");
      pnam = sc.next();
      System.out.println("Enter product cost:");
      pcost = sc.nextFloat();
      System.out.println("Enter product quentity: ");
      pqty = sc.nextFloat();
      bamt= ( pqty * pcost );
      System.out.println("The bill amount is:"+bamt);
      System.out.println("your total bill amount for your purchase is :"+bamt);
  
    }
  }

  