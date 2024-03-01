public class Q_Eight {
  private int x;
  private int y;
  private int radius;
  private int dx;
  private int dy;

  public void Circle(double r, int x, int y) {
    r = radius;
    x = x;
    y = y;
    if (r < 0) {
      r = 1;
    }

  }

  public void Circle(double r, Q_Eight center) {
    center = x;
    if (r < 0) {
      r = 1;
    }

  }

  public void Circle(Q_Eight other) {
    other = x;

  }

  public String stringToString()
  {
    return "(" + r ", " + "(" + x + "," + y ")";

  }

  public void move(int dx, int dy) {
    x = dx;
    y = dy;

  }

  public boolean intersect(Q_Eight C) {
    if (C = this) {
      return true;

    }

    else {
      return false;
    }

  }

}
