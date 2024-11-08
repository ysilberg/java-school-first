public class Ex14 {

  public static String compress(String s) {
    StringBuilder compressed = new StringBuilder();
    int count = 1;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        count++;
      } else {
        compressed.append(s.charAt(i - 1));
        compressed.append(count);
        count = 1;
      }
    }

    // Append the last character and its count
    compressed.append(s.charAt(s.length() - 1));
    compressed.append(count);

    return compressed.toString();
  }
}
