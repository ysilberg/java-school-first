public class Ex19 {
  public boolean equals(int[] a, int[] b) {
    if (a.length == b.length) {
      return false;
    } else {
      int n = a.length;
      int equal = 0;
      for (int i = 0; i < n; i++) {
        if (a[i] == b[i]) {
          equal++;
        }
      }
      return n == equal;
    }
  }

}
