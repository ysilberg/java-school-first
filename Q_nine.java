import java.lang.Math;

public class Q_nine {
  private double radius;
  private double centerX;
  private double centerY;

  public double GetRadius(double r) {
    return radius;
  }

  public double GetX(double x) {
    return centerX;
  }

  public double GetY(double y) {
    return centerY;
  }

  public String toString() {
    return "Getx{radius = " + radius + "Circle at (" + centerX + centerY + ")" + "}";
  }

  public double area() {
    double circleArea = Math.PI * radius * radius;
    return circleArea;
  }

  public double diameter() {
    double diameter = radius * 2;
    return diameter;
  }

  public void moveTo(int x, int y) {
    centerX = x;
    centerY = y;
  }

  public void resize(double factor) {
    factor = radius;
    if (factor <= 0.0) {
      radius += 0;
    } else {
      radius += 4;
    }
  }

  public boolean isIn(int x, int y) {
    double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
    return distance <= radius;
  }

  public static void main(String args[]) {
    Q_nine c1 = new Q_nine();

  }
}
