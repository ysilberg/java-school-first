import java.util.Scanner;

public class Q_ten {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a triple digit number please.");
    int x = scanner.nextInt();
    int a = x/100;
    int b = (x / 10 ) % 10;
    int c = x % 10;
    if (a == c)
      System.out.println("This number is a palindrome.");
   
  }
 
}
