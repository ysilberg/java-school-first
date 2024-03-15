public class Q10 {

  public int howManyOcurrences(int num, int d) {
    int digit = 0;
    int ocurrNum = 0;
    while (num > 0) {
      digit = num % 10;
      if (digit == d) {
        ocurrNum++;
      }
      num /= 10;
    }
    return ocurrNum;
  }

}
