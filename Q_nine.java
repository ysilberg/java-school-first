import java.util.Scanner;

public class Q_nine {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a triple digit number please.");
    int number = input.nextInt();
    int ones = number / 100;
    int tens = (number / 10) % 10;
    int hundreds = number % 10;
    if (ones < tens && tens > hundreds) {
      System.out.println("The number is an extreme number.");
    } else if (ones > 0 && tens > 0 && hundreds > 0) {
      System.err.println("The number is not an extreme number.");
    } else {
      System.out.println("Invalid input");
    }

  }
}