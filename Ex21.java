import java.util.Scanner;

public class Ex21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int shiraThrows = 0;
    int leeThrows = 0;

    System.out.println("Enter the results of each coin toss (H for heads, T for tails):");

    while (shiraThrows < 3 && leeThrows < 3) {
      System.out.print("shira's toss: ");
      String shiraToss = scanner.next().toUpperCase();

      System.out.print("Lee's toss: ");
      String leeToss = scanner.next().toUpperCase();

      if (shiraToss.equals("H")) {
        shiraThrows++;
      }

      if (leeToss.equals("H")) {
        leeThrows++;
      }
    }

    if (shiraThrows == 3) {
      System.out.println("shira starts the game!");
    } else {
      System.out.println("Lee starts the game!");
    }

    scanner.close();
  }
}