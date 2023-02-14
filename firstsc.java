// write a java program to use the scanner class to enter the out put at run time.
import java.util.scanner;
class firstsc {
  public static void main(String[] args) {
    char ch;
    scanner sc=new scanner(system.in);
    System.out.println("enter any charecter value:");
    ch=sc.next().charAt(0);
    System.out.println("the given charecter is: "+ch);
}
}