import java.util.Scanner;

public class Q_ten {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a triple digit number please.");
    int number = input.nextInt();
    int ones = number / 100;
    int tens = (number / 10) % 10;
    int hundreds = number % 10;
    if (ones == tens && ones == hundreds && hundreds == tens) {
      System.out.println("All of the digits are equal");
    } else {
      System.out.println("Invalid input");
    }
  }
}