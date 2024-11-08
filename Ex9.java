public class Ex9 {
  public boolean isSubstring(String s, String t) {
    if (s.contains(t)) {
      System.out.println(t + " is a substring of " + s);
      return true;
    } else {
      System.out.println(t + " is not a substring of " + s);
      return false;
    }
  }
}
