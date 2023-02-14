// using return mothods with arguments


import java.util.Scanner;
class Number{
  int evenOdd(int num){
    if(num%2==0){
      System.out.println("the entered number is even");
    }
    else{
      System.out.println("the entered number is odd");
    }
    return num;
  }
  char vowelConsonent(char ch){
    switch(ch){
      case 'a': case 'A':
      case 'e': case 'E':
      case 'i': case 'I':
      case 'o': case 'O':
      case 'u': case 'U':
      System.out.println("given charecter is vowel");
        break;
      default:
        System.out.println("given charecter is consonent ");
    }
    return ch;
  }
}
class practice11{
  public static void main(String args[]){
    int x,y;
   Scanner sc = new Scanner(System.in);
    Number n1=new Number();
    System.out.println("enter the number");
     int num=sc.nextInt();
    x=n1.evenOdd(num);
    System.out.println("enter the charecter");
    char ch=sc.next().charAt(0);
    y=n1.vowelConsonent(ch);
    
  }
}