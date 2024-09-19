import java.util.Scanner;

public class Ex6 {
  static Scanner reader = new Scanner(System.in);

  public static void main(String[] arg) {
    A a1 = new A(3, '#');
    A a2 = new A(3, '*');
    a1.printTav();
    a2.printTav();
    a1.add(2);
    a2.setNum(2);
    a1.printTav();
    a2.printTav();
  }

}
