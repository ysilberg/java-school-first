import java.util.Scanner;

public class EXarr4 {
  public int[] inputArray(int[] a) {
    Scanner myObj = new Scanner(System.in);
    for (int i = 0; i <= a.length; i++) {
      a[i] = myObj.nextInt();
    }
    return a;
  }

}
