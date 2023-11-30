import java.util.Scanner;

public class Nine_rechtangle {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please insert the length of height and width.");
    int height = myObj.nextInt();
    int width = myObj.nextInt();
    System.out.println("The area of the rechtangle is:" + height * width);
    System.out.println("The perimeter is:" + 2 * (height + width));

  }
}