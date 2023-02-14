//create a main class bank account and  enter the name and account number find the balance and deposit and withdraw and  show resipt
import java.util.Scanner;
class Bank
{
  String name;
  long acc_num;
  double tot_amt;
  double dep_amt;
  double wid_amt;
  double bal_amt;
  double lef_amt;
  Scanner sc= new Scanner(System.in);
  void name(){
  System.out.println("enter the name of account holder:");
  name=sc.next();
  System.out.println("enter the account number of bank holder:");
  acc_num=sc.nextLong();
  System.out.println("enter the total amount in bank account:");
  tot_amt=sc.nextDouble();
  }
  void depositAmount(){
    System.out.println("enter the deposit amount:");
    dep_amt=sc.nextDouble();
    bal_amt=(dep_amt+tot_amt);
  }
  void withdrawAmount(){
    System.out.println("enter the withdraw amount:");
    wid_amt=sc.nextDouble();
    lef_amt=(bal_amt-wid_amt);
    if(wid_amt>bal_amt){
      System.out.println("your withdraw amount is grater than your total balnce:insufficent funds");
    }else{
      System.out.println("your remaining balance is"+lef_amt);
    }
  } 
     void recept(){
       System.out.println("Recipt summary:");
       System.out.println("---------------");
       System.out.println("The account holders name:"+name);
       System.out.println("The account holder number:"+acc_num);
       System.out.println("The total amount in account:"+tot_amt);
       System.out.println("Deposit amount:"+dep_amt);
       System.out.println("Withdraw amount:"+wid_amt);
       System.out.println("Balance left on account:"+lef_amt);
    }
}

    class practice12{
      public static void main(String args[]){
        Bank b1=new Bank();
        b1.name();
        b1.depositAmount();
        b1.withdrawAmount();
        b1.recept();
        
      }
    }