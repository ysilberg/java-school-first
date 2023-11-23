import java.util.Scanner;
public class Q_eleven {

  public static void main(String[] args){
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter a triple digit number please.");
      int a = scanner.nextInt();
      int x = a/100;
      int y = (a/10) % 10;
      int z = a % 10;
      if (z == x && z == y && y == x)
        System.out.println("All of the digits of this number are equal.");
    }  
  }
}

