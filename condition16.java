// write a java program to print the current bill of a user using conditional statements.
import java.util.Scanner;
class condition16
  {
  public static void main(String args[]) 
    {
    int cno,pmr,lmr,tu;
    String cname;
    double cbill;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter consumer number:");
    cno = sc.nextInt();
    System.out.println("Enter consumer Name:");
    cname = sc.next();
    System.out.println("Enter Present Month Reading:");
    pmr = sc.nextInt();
    System.out.println("Last Month Reading:");
    lmr = sc.nextInt();
    tu=pmr-lmr;
    cbill= tu;
    System.out.println("consumer number:" + cno);
    System.out.println("consumer name:" + cname);
    System.out.println("Present Month Reading:" + pmr);
    System.out.println("Last Month Reading:" + lmr);
    System.out.println("total units:" + tu);
    System.out.println("the bill is:" + cbill);
    
    if(tu<=50){
        cbill=tu*1.45;
          System.out.println("the bill amount is:"+cbill);
        }
        {
           if(tu<=100){ 
            cbill=(50*1.45)+(tu-50)*2.56;
          System.out.println("the bill amount is:"+cbill);
           }
          else if(tu<=200){
            cbill=(50*1.45)+(50*2.56)+(tu-100)*3.50;
            System.out.println("the bill amount is:"+cbill);
          }
          else if(tu<=300){
            cbill=(50*1.45)+(50*2.56)+(50*3.50)+(tu-150)*4.67;
          System.out.println("the bill amount is:");
          }
        
        else {
        cbill=(50*1.45)+(50*2.56)+(50*3.50)+(50*4.67)+(tu-200)*5.67;
        System.out.println("the bill amount is:"+cbill);
       }
      } 
     }
    }
  