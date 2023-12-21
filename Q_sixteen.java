import java.util.Scanner;

public class Q_sixteen {
  static Scanner input = new Scanner(System.in);

  public static void main(String args[]) {
    System.out.println("Enter the month please.");
    int month = input.nextInt();
    switch (month) {
      case 1:
        System.out.println("The month is january");
        break;
      case 2:
        System.out.println("The month is february");
        break;
      case 3:
        System.out.println("The month is march");
        break;
      case 4:
        System.out.println("The month is april");
        break;
      case 5:
        System.out.println("The month is may");
        break;
      case 6:
        System.out.println("The month is june");
        break;
      case 7:
        System.out.println("The month is july");
        break;
      case 8:
        System.out.println("The month is august");
        break;
      case 9:
        System.out.println("The month is september");
        break;
      case 10:
        System.out.println("The month is october");
        break;
      case 11:
        System.out.println("The month is november");
        break;
      case 12:
        System.out.println("The month is december");
        break;
      default:
        System.out.println("Invalid input.");

    }
  }
}