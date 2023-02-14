//Write a program that takes a user's input of a number and a letter, and prints whether the number is even or odd and if the letter is a vowel or a consonant. Use nested if statements to determine both the number's parity and the letter's classification.
import java.util.Scanner;
class number{
  int num;
  char ch;
  Scanner sc = new Scanner(System.in);
  void EvenOdd(){
    System.out.println("enter the number:");
    num=sc.nextInt();
    if(num%2==0){
      System.out.println("the given number is even");
    }else{
      System.out.println("the given number is odd");
    }
  } void VowelConsonent(){
    System.out.println("enter the charecter:");
    ch=sc.next().charAt(0);
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
class practice8{
  public static void main(String args[]){
    number n1=new number();
    n1.EvenOdd();
    n1.VowelConsonent();
  }
}