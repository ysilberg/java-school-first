import java.util.Scanner;

public class Ex25 {
  public String name;
  public int num1;
  public int num2;

  public Ex25(String name) {
    this.name = name;
    this.num1 = 0;
    this.num2 = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNum1() {

    return num1;
  }

  public void setNum1(int num1) {

    this.num1 = num1;
  }

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public void MultiCamp(String name) {
    this.name = name;
  }

  public void Enlister(int age, int distanceToShfayim, int distanceToEinat) {
    int rejectedChildren = 0;
    if (age >= 8 && age <= 11) {
      if (distanceToShfayim < distanceToEinat && num1 < 100) {
        num1++;
      } else if (einat.num1 < 100) {
        einat.num1++;
      } else {
        rejectedChildren++;
      }
    } else if (age >= 12 && age <= 15) {
      if (distanceToShfayim < distanceToEinat && num2 < 100) {
        num2++;
      } else if (einat.num2 < 100) {
        einat.num2++;
      } else {
        rejectedChildren++;
      }
    } else {
      rejectedChildren++;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Ex25 shfayim = new Ex25("Shfayim");
    Ex25 einat = new Ex25("Einat");

    int age, distanceToShfayim, distanceToEinat;
    int rejectedChildren = 0;

    while (true) {
      System.out.print("Enter child's age (999 to exit): ");
      age = scanner.nextInt();

      if (age == 999) {
        break;
      }

      System.out.print("Enter distance to Shfayim: ");
      distanceToShfayim = scanner.nextInt();
      System.out.print("Enter distance to Einat: ");
      distanceToEinat = scanner.nextInt();

      shfayim.Enlister(age, distanceToShfayim, distanceToEinat);
    }

    System.out.println("\nShfayim Camp:");
    System.out.println(shfayim);
    System.out.println("Einat Camp:");
    System.out.println(einat);
    System.out.println("Number of rejected children: " + rejectedChildren);
  }

}
