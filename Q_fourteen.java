import java.util.Scanner;

public class Q_fourteen {
  public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
      System.out.println("Enter  EX1  grade:");
      double Ex1 = myObj.nextInt();
      System.out.println("Enter  EX2  grade:");
      double Ex2 = myObj.nextInt();
      System.out.println("Enter  EX3  grade:");
      double Ex3 = myObj.nextInt();
      System.out.println("Enter  final exam grade:");
      double finalExam = myObj.nextInt();
      double finalGrade = Ex1 * 0.05 + Ex2 * 0.05 + Ex3 * 0.05 + finalExam * 0.85;
      System.out.println("Your final grade is: " + finalGrade);
    }
  }
}