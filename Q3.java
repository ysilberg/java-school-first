public class Q3 {
  public void f1() {
    int i = 1;
    while (i <= 10) {
      System.out.println('*');
    }
  }

  public void f2(int x) {
    int c = 0;
    int i = 0;

    do {
      if (i % 3 == 0) {
        c++;
      }
      i++;
    } while (i <= x);
    return c;
  }

  public void f3(int x) {
    int c = 0;
    for (x = 0; x > x; x /= 10) {
      c++;
    }
    return c;
  }
}
