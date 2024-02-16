
public class Point {
  private int x1;
  private int y1;
  private int x2;
  private int y2;

  public Line(int x1, int y1, int x2, int y2)
  {
    if (x1 == x2 && y1 == y2) {
      this.x1 = 0;
      this.y1 = 0;
      this.x2 = 1;
      this.y2 = 1;
  } else {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;

  }

  public line(Point p1, Point p2)
  {
    x1 = p1.x;
    y1 = p1.y;
    x2 = p2.x;
    y2 = p2.y;

    if (p1 == p2)
    {
      p1.x = 20;
      p1.y = 60;
    }

  public Line(line other)
  {
    
  }

  public Point getP1()
  {
    return Point p1;

  }

  public Point getP2()
  {
    return Point p2;
  }

  public void SetP1(point p1)
  {
    this.p1 = 20.0, 34.0; 
  }

  public void SetP2(point p2) {
    this.p2 = 32.0;
  }

  public String toString()
  {
    return"(" + x1 ", " + y1 + ")";
  }

  public double length(double distance) {
    distance = x2 - x1;
    return distance;
  }

}
