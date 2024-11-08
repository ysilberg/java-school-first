public class Ex13 {

  public String replace(String s, char origin, char target) {
    char[] charArr = s.toCharArray();
    for (int i = 0; i <= s.length(); i++) {
      if (charArr[i] == origin) {
        charArr[i] = target;
      }
    }

    String String = new String(charArr);
    return String;

  }

}
