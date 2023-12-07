import java.util.Scanner;

public class Q_eight {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter width:");
    int width = input.nextInt();
    System.out.println("Enter length:");
    int length = input.nextInt();
    if (width > 0 && length > 0) {
      System.out.println("The area is:" + width * length);
    } else {
      System.out.println("Wrong input");
    }

  }
}