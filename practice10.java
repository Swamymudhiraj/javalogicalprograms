// checking whether even or odd or vowel or consonent: 
import java.util.Scanner;
class Number{
  void evenOdd(int num){
    if(num%2==0){
      System.out.println("the entered number is even");
    }
    else{
      System.out.println("the entered number is odd");
    }
  }
  void vowelConsonent(char ch){
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
  }
}
class practice10{
  public static void main(String args[]){
    
   Scanner sc = new Scanner(System.in);
    Number n1=new Number();
    System.out.println("enter the number");
     int num=sc.nextInt();
    n1.evenOdd(num);
    System.out.println("enter the charecter");
    char ch=sc.next().charAt(0);
    n1.vowelConsonent(ch);
    
  }
}