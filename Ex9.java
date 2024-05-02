public class Ex9 {
  public int difference(int[] arr) {
    int min = arr[0];
    int max = arr[0];

    // Iterate through the array to find min and max
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return max - min;

  }

}
