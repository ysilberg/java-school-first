public class Ex12 {
  public int countOdd(int[] nums) {
    int result = 0;
    int n = nums.length;

    for (int i = 0; i <= n; i++) {
      if (nums[i] % 2 != 0) {
        result++;
      }
    }

    return result;
  }
}
