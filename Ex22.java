
import java.util.Scanner;

public class Ex22 {
  public static int price = 30;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter length: ");
    int length = scanner.nextInt();
    System.out.println("Enter width: ");
    int width = scanner.nextInt();

    int area = length * width;
    int total = (200 / area) * price;
    System.out.println("Total cost: " + total);

  }

}
