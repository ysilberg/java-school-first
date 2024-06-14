public class Ex6 {
  private int d;

  public String originatlText(String Encoded, char arr[]) {
    arr = Encoded.toCharArray();

    for (int i = 0; i <= arr.length; i++) {
      arr[i] = arr[i - d];
    }

    String decoded = new String(arr);

    return decoded;
  }

}
