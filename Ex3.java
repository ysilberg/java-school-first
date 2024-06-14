public class Ex3 {

  public int discounts(int age, int num, Boolean city) {
    int check = 0;
    if (city == true) {
      check += 1;
    } else {
      check += 2;
    }

    if (num >= 3) {
      check += 10;
    } else {
      check += 20;
    }

    if (age >= 70) {
      check += 100;
    } else {
      check += 200;
    }

    return check;
  }

}
