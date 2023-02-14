// write a java program to print calculator using conditions and switch case.


import java.util.Scanner;
class switchcase2
  {
    public static void main(String args[])
    {
      int a=0,b=0,ch;
      double c;
      Scanner sc = new Scanner(System.in);
      System.out.println("welcome to calculator:");
      System.out.println("---------------------:");
      System.out.println("[1] Addition:");
      System.out.println("[2] Subcration:");
      System.out.println("[3] Multiplication:");
      System.out.println("[4] Division:");
      System.out.println("[5] Moudulus:");

      System.out.println("enter your choice");
      ch=sc.nextInt();
       //System.out.println("print a,b values");
       // num1=sc.nextInt();
        //num2=sc.nextInt();

     if(ch<=5){
       System.out.println("print a,b values");
        a=sc.nextInt();
        b=sc.nextInt();
     }
      
      switch(ch){
        case 1:
          c=(a + b );
          System.out.println("the addition of two numbers is:"+c);
          break;
        case 2:
          c=(a-b);
          System.out.println("the subscraction of two numbers is:"+c);
          break;
        case 3:
          c=(a*b);
          System.out.println("the multiplication of two numbers is:"+c);
          break;
           case 4:
          c=(a/b);
          System.out.println("the division of two numbers is :"+c);
          break;
        case 5:
          c=(a%b);
          System.out.println("the modulous of two numbers is:"+c);
          break;
        default:
          System.out.println("wrong choice");
      } 
    
   }
}
  