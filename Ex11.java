public class Ex11 {
  public int countNums(double[] dArr, double num) {
    int result = 0;
    int n = dArr.length;
    for (int i = 0; i <= n; i++) {
      if (n <= dArr[i]) {
        result++;
      }
    }

    return result;
  }
}
