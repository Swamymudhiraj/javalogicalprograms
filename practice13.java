//create a main class bank account and  enter the name and account number find the balance and deposit and withdraw and  show resipt
import java.util.Scanner;
    class Bankaccount{
      double tot_bal;
      double lef_bal;
    void deposit(double dep_amt,double bal_amt){
     tot_bal=(bal_amt+dep_amt);
    System.out.println("the total balance after deposit"+tot_bal);
    
  }
  void withdraw(double wid_amt){
     lef_bal=(tot_bal-wid_amt);
    if(tot_bal>wid_amt){
      System.out.println("insufficent funds");
    }
    else{
      System.out.println("remaining amount:"+lef_bal);
    }
  }
   void resiptSummary(String name,long acc_num,double dep_amt,double wid_amt){
       System.out.println("Recipt summary:");
       System.out.println("---------------");
       System.out.println("The account holders name:"+name);
       System.out.println("The account holder number:"+acc_num);
       System.out.println("The total amount in account:"+tot_bal);
       System.out.println("Deposit amount:"+dep_amt);
       System.out.println("Withdraw amount:"+wid_amt);
       System.out.println("Balance left on account:"+lef_amt);
   }
  }
class practice13{
  public static void main(String args[]){
    Bankaccount b1=new Bankaccount();
    Scanner sc = new Scanner(System.in);
    String name;
    long acc_num;
    double bal_amt,dep_amt,wid_amt;
    System.out.println("Enter the name of account holder");
    name=sc.next();
    System.out.println("Enter the account  umber of account holder");
    acc_num=sc.nextLong();
    System.out.println("Enter the balance amount");
    bal_amt=sc.nextLong();
    System.out.println("Enter the amount of deposit:");
    dep_amt=sc.nextDouble();
    b1.deposit(dep_amt, bal_amt);
    System.out.println("enter the amount of dwithdraw");
     wid_amt=sc.nextDouble();
    b1.withdraw(wid_amt);
    b1.resiptSummary(name, acc_num, dep_amt, wid_amt);
    
  
  }
}