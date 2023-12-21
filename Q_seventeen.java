import java.util.Scanner;

public interface Q_seventeen {
  static Scanner input = new Scanner(System.in);

  public static void main(String args[]) {
    System.out.println("Enter 2 positive numbers please.");
    int firstNumber = input.nextInt();
    int secondNumber = input.nextInt();
    if (firstNumber < 0 && secondNumber < 0) {
      System.out.println("Invalid input");
    } else {
      System.out.println("Choose one of three options:\n1)Sum\n2)Deduct\n3)Multiply");
      int choice = input.nextInt();
      switch (choice) {
        case 1:
          System.out.println("The sum is:" + (firstNumber + secondNumber));
          break;
        case 2:
          System.out.println("The difference is:" + (firstNumber - secondNumber));
          break;
        case 3:
          System.out.println("The multiplication is:" + (firstNumber * secondNumber));
          break;
        default:
          System.out.println("Invalid input");
      }
    }

  }
}