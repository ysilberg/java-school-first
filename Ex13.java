public class Ex13 {

  public static boolean isPalindrome(int[] a) {
    if (a == null || a.length == 0) {
      return false;
    }

    int left = 0;
    int right = a.length - 1;

    while (left < right) {
      if (a[left] != a[right]) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }

}