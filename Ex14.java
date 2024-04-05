public class Ex14 {
  public void printMultiply() {
    int myLoopVar = 0;
    int multBy = 0;

    for (myLoopVar = 1; myLoopVar <= 10; myLoopVar++) {
      for (multBy = 0; multBy <= 10; multBy++) {
        System.out.println(myLoopVar * multBy + "\t");
      }
      System.out.println();
    }
  }

}
