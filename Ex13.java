public class Ex13 {
  public int floorA;
  public int floorB;

  public parking()
  {
    T_a();
    T_b();
  }

  public int T_a() {
    return floorA++;
  }

  public int T_b() {
    return floorB++;
  }
}
