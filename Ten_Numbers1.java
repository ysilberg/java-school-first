import java.util.Scanner;

public class Ten_Numbers1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter a 3 digits number");
    int number = myObj.nextInt();
    int Ones = number / 100;
    int Tens = (number / 10) % 10;
    int Hundreds = number % 10;
    System.out.println("The result is: " + Ones + "," + Tens + "," + Hundreds);

  }
}