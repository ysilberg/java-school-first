import java.util.Scanner;

public class Q_fiveteen {
  public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
      System.out.println("Please the price");
      double price = myObj.nextDouble();
      int shtarot = (int) price;
      double agorotDecimal = price - shtarot;
      int shtar200 = shtarot / 200;
      shtarot %= 200;
      int shtar100 = shtarot / 100;
      shtarot %= 100;
      int shtar50 = shtarot / 50;
      shtarot %= 50;
      int shtar10 = shtarot / 10;
      shtarot %= 10;
      int coin5 = shtarot / 5;
      shtarot %= 5;
      int coin1 = shtarot;
      int agorotInt = (int) (agorotDecimal * 100);
      int agorotCoin10 = (agorotInt - agorotInt % 10) / 10;
      System.out.println("Quantity of the 200 sheckel bill is " + shtar200);
      System.out.println("Quantity of the 100 sheckel bill is " + shtar100);
      System.out.println("Quantity of the 50 sheckel bill is " + shtar50);
      System.out.println("Quantity of the 10 sheckel bill is " + shtar10);
      System.out.println("Quantity of the 10 sheckel bill is " + shtar10);
      System.out.println("Quantity of the 5 sheckel coin is " + coin5);
      System.out.println("Quantity of the 1 sheckel coin is " + coin1);
      System.out.println("Quantity of the 10 agorot coin is " + agorotCoin10);
    }
  }
}