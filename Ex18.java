public class Ex18 {
  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void printAllPrimes(int a, int b) {
    System.out.println("Prime numbers between " + a + " and " + b + ":");
    for (int i = a; i <= b; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static int differencePrimes(int a, int b) {
    int smallestPrimeDiff = Integer.MAX_VALUE;
    int largestPrimeDiff = -1;
    for (int i = a; i <= b; i++) {
      if (isPrime(i)) {
        for (int j = i + 1; j <= b; j++) {
          if (isPrime(j)) {
            int diff = j - i;
            smallestPrimeDiff = Math.min(smallestPrimeDiff, diff);
            largestPrimeDiff = Math.max(largestPrimeDiff, diff);
          }
        }
      }
    }
    if (largestPrimeDiff == -1) {
      return -1;
    }
    return largestPrimeDiff - smallestPrimeDiff;
  }
}
