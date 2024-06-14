public class Parking {

  private int id;
  private Ex5 in;
  private Ex5 out;

  public String first(int[] Parking) {
    int minIndex = 0;

    for (int i = 1; i < Parking.length; i++) {
      if (Parking[i] < Parking[minIndex]) {
        minIndex = i;
      }
    }
    return id;
  }

  public int total() {
    int result = out - in;
    return result;
  }

  public int sumMoney(int[] cars) {
    int sum = 0;
    for (int i = 0; i <= cars.length; i++) {
      sum += (total() - 120) * 1;
    }

    return sum;
  }

}
