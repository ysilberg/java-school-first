public class Ex12 {

  public boolean isUpdownNumber(int[] num) {
    boolean increasing = num[1] >= num[0];
    for (int i = 2; i < num.length; i++) {
      if (increasing && num[1] >= num[0]) {
        return false;
      } else if (!increasing && num[i] > num[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public int peak(int num) {
    int biggestDigit = 0;
    int index = 0;
    while (num > 0) {
      num = num % 10;
      if (num > biggestDigit) {
        biggestDigit = num;
        index = 1;
      } else if (num == biggestDigit) {
        index++;
      }
      num /= 10;
    }
    return index;
  }

}