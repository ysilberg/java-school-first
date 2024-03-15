public class Q8 {
  public boolean isAscending(int num) {
    String numbeString = String.valueOf(num);

    for (int i = 0; i < numbeString.length() - 1; i++) {
      if (numbeString.charAt(i) >= numbeString.charAt(i + 1)) {
        return false;
      }
    }
    return true;
  }

}
