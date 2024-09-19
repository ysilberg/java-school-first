import java.util.Scanner;
import java.util.Arrays;

public class Ex8 {

  static Scanner reader = new Scanner(System.in);

  public void getNumber(String numberStrings) {
    System.out.println("Enter your number:");
    numberStrings = reader.nextLine();

    int[] numArray = new int[numberStrings.length()];

    for (int i = 0; i < numberStrings.length(); i++) {
      numArray[i] = Integer.parseInt(numberStrings[i]) + 1;
    }

    System.out.println(numArray[numArray.length]);

  }
}
