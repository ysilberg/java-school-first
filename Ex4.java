public class Ex4 {

  private int[] arr;
  private String name;

  public int deltas(Boolean isLonger) {
    int result = 0;

    if (isLonger == true) {
      for (int i = 0; i <= arr.length; i++) {
        if (i > (i - 1)) {
          result += arr[i] - arr[i - 1];
        } else {
          i++;
        }
      }
    }

    else {
      for (int i = 0; i <= arr.length; i++) {
        if (i < (i - 1)) {
          result += arr[i] - arr[i - 1];
        } else {
          i++;
        }
      }
    }
    return result;
  }

  public Boolean improving() {
    if (deltas(false) > deltas(true)) {
      return true;
    } else {
      return false;
    }
  }
}
