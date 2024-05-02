public class Ex10 {
  public boolean isSorted(int[] a) {
    int[] oldArr = a;
    int n = a.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
    return oldArr == a;
  }
}
