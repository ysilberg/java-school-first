import java.util.Scanner;

public class Q_twelve {
  public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
      System.out.println("Please enter price:");
      double nisPrice = myObj.nextInt();
      double dollarPrice = nisPrice * 3.5;
      System.out.println(dollarPrice + "$ are " + nisPrice + " NIS.");
    }

  }
}
