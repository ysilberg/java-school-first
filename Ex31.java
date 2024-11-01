import java.util.Scanner;

public class Ex31 {

  public static int Truther(int number) {
    if (number == 7 || number % 7 == 0) {
      return 7;
    } else {
      return number;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of players.");
    int playerNum = scanner.nextInt();
    int gameNum = 0;
    int playerInput = 0;
    while (playerNum != 1) {
      int checkingNum = gameNum;
      System.out.println("Enter number");
      playerInput = scanner.nextInt();

      Truther(checkingNum);
      if (playerInput != checkingNum) {
        System.out.println("X");
        playerNum--;
      } else {
        System.out.println("V");
      }

      gameNum++;
    }

  }

}
