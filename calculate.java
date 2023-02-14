// print the addition of two numbers using conditional statements

import java.util.Scanner;
class addition

  {
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    void add()
    {
      
    
      System.out.println("enter a,b values:");
      a = sc.nextInt();
      b = sc.nextInt();
      c= a + b;
      System.out.println("the Addition valueis:"+c);
      
      
    }
  }
class calculate
  {
    public static void main(String []args)
    {
      addition a1 = new addition();
      a1.add();
    }
  }