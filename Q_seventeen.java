import java.util.Scanner;

public class Q_eighteen{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insert 2 ,2 digit numbers please.");
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int a = x / 10;
    int b = (x / 10) % 10;
    int c  = y / 10;
    int d  = (y / 10) % 10; 
    if ((a + b) == (c + d));
    System.out.println("The numbers are equal.");
    
  }
}