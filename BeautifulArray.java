public class BeautifulArray {

  // Function to calculate the sum of digits
  public static int sumOfDigits(int number) {
    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number /= 10;
    }
    return sum;
  }

  // Function to count the number of even divisors
  public static int countEvenDivisors(int number) {
    int count = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0 && i % 2 == 0) {
        count++;
      }
    }
    return count;
  }

  // Function to check if a number is beautiful
  public static boolean isBeautifulNumber(int number) {
    return sumOfDigits(number) == countEvenDivisors(number);
  }

  // Function to check if a 1D array is beautiful
  public static boolean isBeautifulArray(int[] array) {
    int beautifulCount = 0;
    int unbeautifulCount = 0;

    for (int num : array) {
      if (isBeautifulNumber(num)) {
        beautifulCount++;
      } else {
        unbeautifulCount++;
      }
    }

    return beautifulCount > unbeautifulCount;
  }

  // Function to check if a 2D array is beautiful
  public static void checkBeautifulTwoDArray(int[][] array) {
    for (int[] row : array) {
      if (!isBeautifulArray(row)) {
        System.out.println("The given array is NOT a beautiful two-dimensional array.");
        return;
      }
    }
    System.out.println("The given array IS a beautiful two-dimensional array.");
  }

  // Main method to test the functions
  public static void main(String[] args) {
    int[][] array = {
        { 24, 36, 48 }, // Beautiful row
        { 18, 12, 6 }, // Beautiful row
        { 24, 30, 42 } // Beautiful row
    };

    checkBeautifulTwoDArray(array);
  }
}
