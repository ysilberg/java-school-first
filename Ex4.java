import java.util.Scanner;

public class Ex4 {
  public void inputArray(int[] a) {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int[] array = new int[10];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {

      array[i] = sc.nextInt();
    }
  }

}
