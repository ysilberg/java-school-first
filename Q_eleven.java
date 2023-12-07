import java.util.Scanner;

public class Q_eleven {
  public static void main(String[] args) {
    System.out.println("Welcome to our hotel. In which room do you want to stay?");
    System.out.println("1. Regular (250 NIS per night)");
    System.out.println("2. Double (400 NIS per night)");
    System.out.println("3. Suite (600 NIS per night)");
    Scanner input = new Scanner(System.in);
    int room = input.nextInt();

    if (room >= 1 && room <= 3) {
      System.out.println("How many nights do you want to stay?");
      int nights = input.nextInt();

      if (nights > 0) {
        System.out.println("Do you want breakfast included (50 NIS per night)? (press 1 for yes, 2 for no)");
        int breakfast = input.nextInt();

        if (breakfast == 1) {
          System.out.println("Breakfast is included");
        } else if (breakfast == 2) {
          System.out.println("Breakfast is not included");
        } else {
          System.out.println("Invalid choice for breakfast");
          return;
        }

        // Calculate total cost
        int nightlyPrice;
        switch (room) {
          case 1:
            nightlyPrice = 250;
            break;
          case 2:
            nightlyPrice = 400;
            break;
          case 3:
            nightlyPrice = 600;
            break;
          default:
            nightlyPrice = 0;
            break;
        }

        int totalCost = nights * nightlyPrice + (breakfast == 1 ? 50 * nights : 0);

        // Print reservation details
        System.out.println("Your reservation for room " + room + " for " + nights + " nights, with "
            + (breakfast == 1 ? "breakfast" : "no breakfast") + " - Total cost: " + totalCost + " NIS");
      } else {
        System.out.println("Invalid nights number");
      }
    } else {
      System.out.println("Invalid room number");
    }

  }

}