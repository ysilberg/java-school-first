
import java.lang.Math;

public class Ex17 {

  private String name;
  private int grd;

  public void Student(String name) {
    this.name = "Sapir";
    this.grd = 11;
  }

  public void addGrd(int grd) {
    grd += grd;
  }

  public int minGrade() {
    return Math.min(grd, grd);
  }

  public int maxGrade()
  {
    return Math.max(grd, grd)
  }

  public double average() {
    return (grd * grd) / 2;
  }

  public String toString() {
    return "Name: " + name + "\t" + "Grade: " + grd;
  }

}
