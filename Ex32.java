import java.util.Random;

public class Ex32 {
  public int Tom;
  public int Jerry;
  public static int num;

  public Ex32() {
    this.Tom = 10;
    this.Jerry = 40;
    this.num = 0;
  }

  public static void main(String[] args) {
    Random random = new Random();
    int Jerry = 0;
    int Tom = 0;
    int steps = 0;

    while (Jerry != Tom || Jerry != 50) {
      steps = random.nextInt(11) - 5;
      Jerry += steps;
      steps = random.nextInt(11) - 5;
      Tom += steps;
      num++;
    }
  }

}
