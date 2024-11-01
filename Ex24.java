import java.util.Scanner;

public class Ex24 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int maxSum = Integer.MIN_VALUE;
    int maxX = 0, maxY = 0;

    while (true) {
      System.out.print("Enter a pair of integers (x y): ");
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      if ((x % 2 == 0 && y % 2 != 0) || (x % 2 != 0 && y % 2 == 0)) {
        break;
      }

      int sum = x + y;

      if (sum > maxSum) {
        maxSum = sum;
        maxX = x;
        maxY = y;
      }
    }

    scanner.close();

    if (maxSum != Integer.MIN_VALUE) {
      System.out.println("The pair with the largest sum is: (" + maxX + ", " + maxY + ")");
    } else {
      System.out.println("No valid pairs were entered.");
    }
  }
}
