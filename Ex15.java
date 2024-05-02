public class Ex15 {
  public void arrayShift(int[] a) {
    int n = a.length;
    int[] temp = new int[n];

    for (int i = 0; i < n; i++) {
      int newIndex = (i + 1) % n;
      temp[newIndex] = a[i];
    }

    // Copy the elements back to the original array
    for (int i = 0; i < n; i++) {
      a[i] = temp[i];
    }
  }

}
