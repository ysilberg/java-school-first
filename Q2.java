public class Q2 {
  public int findMissingNum(int num_arr[]) {
    int[] diff_arr;
    int num;
    for (int i = 0; i <= num_arr.length; i++) {
      diff_arr[i] = num_arr[i++] - num_arr[i];
    }

    for (int j = 0; j <= diff_arr.length; j++) {
      if (diff_arr[j++] != diff_arr[j]) {
        num = num_arr[j];
      }
    }
    return num;

  }

}
