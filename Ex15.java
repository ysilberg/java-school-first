public class Ex15 {
  public void square(int n) {
    if (n > 0) {
      for (int i = 1; i <= n; i++) {
        for (int j = 0; j <= n; j++) {
          System.out.println("*" + "\t");
        }
        System.out.println();
      }
    } else {
      System.out.println("Invalid input.");
    }

  }
}
