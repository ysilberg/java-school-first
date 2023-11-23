import java.util.Scanner;
public class Q_twenty {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter grade:");
    int myGrade = scanner.nextInt();
    if (myGrade > 80)
    System.out.println("You have a high grade.");
    else if (myGrade > 60 && myGrade < 80) {
      System.out.println("Yous have an avarage grade.");
        
    }
    else 
      System.out.println("Your grade is low.");  
     
 }
}