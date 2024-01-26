public class Q_Eight {
  private String hebrew;
  private String english;

  String getHeb(String hebrew) {
    hebrew = "חתול";
    return hebrew;
  }

  public void setEng(String e) {
    english = e;
  }

  public void setHeb(String h) {
    hebrew = h;
  }

  String toString(String h, String e) {
    String result = h + ":" + e;
    return result;
  }

  public static void main(String args[]) {
    Q_Eight l1 = new Q_Eight();
    l1.setEng("cat");
    l1.setHeb("חתול");
    System.out.println(l1.toString());

  }

}
