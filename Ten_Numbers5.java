import java.util.Scanner;

public class Ten_Numbers5 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter first digit");
    double firstDigit = myObj.nextInt();
    System.out.println("Please enter second digit");
    double secondDigit = myObj.nextInt();
    System.out.println("Please enter third digit");
    double thirdDigit = myObj.nextInt();
    System.out.println("The number is:" + (firstDigit * 100 + secondDigit * 10 + thirdDigit) / 1000);

  }
}
