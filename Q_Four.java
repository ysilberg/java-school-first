
import java.lang.Math;

public class Q_Six {
  private int x, y;

  public Point(int x, int y) {
  this.x = x;
  this.y = y;
  }

  public Point(Point p) {
  x = p.x;
  y = p.y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

}

  public boolean equals(Point p)
{
  if(x == p.x && y == p.y)
  {
    return true;
  return false;  
  }

  public String tostring()
  {
    return"(" + x ", " + y + ")";
  }

}

  public void move(int dx, int dy) {
    dx = 8;
    dy = 10;
    x += dx;
    y += dy;
  }

  public double distance(Point p, Point this)
  {
    point p = dx - x;
    Point this = dy - y;
    return (Math.sqr((Math.pow(p , 2) + Math.pow(this , 2))));
    
  }

  public double distanceFromBase()
  {
    point p = dx ;
    Point this = dy;
    return (Math.sqr((Math.pow(p , 2) + Math.pow(this , 2))));
    
  }

  public class pointTester()
  {

    public static void main (String[] args)
    {
      Point p2  = new Point((int) (Math.random() * 10)),(int Math.random());
      p2.setX(20);
      System.out.println("X:" + p2.getX());
      p2 = null;

      Point p3 = new Point((int) (Math.random() * 10)),(int Math.random());
      p3.setX(20);
      System.out.println("X:" + p3.getX());

    }
}
