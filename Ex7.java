public class Ex7 {
  public static int countEvenDigits(int n) {
    int count = 0;
    n = Math.abs(n);

    while (n > 0) {
      int digit = n % 10;
      if (digit % 2 == 0) {
        count++;
      }
      n /= 10;
    }

    return count;
  }
}
