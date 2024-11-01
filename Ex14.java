import java.util.Scanner;

public class Ex14 {

  public static void Main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = (int) (Math.random() * 26);
    char ch = (char) ((int) ('A') + n);
    int tries = 5;
    char userInput = ' ';

    System.out.println("Guess mate: ");
    while (tries != 0) {
      userInput = scan.next().trim().charAt(0);
      if (userInput == ch) {
        System.out.println("Guessed right after- " + tries + " tries.");
        break;
      } else {
        tries--;
      }

    }

    System.out.println("Failed to guess");
  }

}
