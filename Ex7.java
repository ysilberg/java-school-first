public class Ex7 {
  public double average(double[] dArr) {
    int len = dArr.length;
    int sum = 0;
    for (int i = 0; i < len; i++) {
      sum += dArr[i];
    }
    return sum / len;
  }
}
