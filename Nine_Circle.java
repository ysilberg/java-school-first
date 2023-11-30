import java.util.Scanner;

public class Nine_Circle {
  public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
      System.out.println("Please insert radius value.");
      int radius = myObj.nextInt();
      System.out.println("The area of the circle is " + 3.14 * radius * radius);
      System.out.println("The perimiter of the Circle is " + 3.14 * 2 * radius);
    }

  }
}