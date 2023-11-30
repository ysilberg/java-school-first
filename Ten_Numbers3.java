import java.util.Scanner;

public class Ten_Numbers3 {
  public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
      System.out.println("Please enter a 4 digits number");
      int number = myObj.nextInt();
      int thousands = number / 1000;
      int hundreds = (number % 1000) / 100;
      int tens = (number % 100) / 10;
      int ones = number % 10;
      System.out.println("The new number is: " + ones + tens + hundreds + thousands);
    }

  }
}