import java.util.Scanner;

public class Ten_Numbers4 {
  public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
      System.out.println("Please enter first digit");
      int firstDigit = myObj.nextInt();
      System.out.println("Please enter second digit");
      int secondDigit = myObj.nextInt();
      System.out.println("Please enter third digit");
      int thirdDigit = myObj.nextInt();
      System.out.println("The number is:" + firstDigit + secondDigit + thirdDigit);
    }

  }
}