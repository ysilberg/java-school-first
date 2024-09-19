public class Ex9 {
  private String name;
  private double speed;
  private int mem;
  private double price;

  public Computer()
  {
    Ex9 pc = new Ex9();
    pc.name = "Dell";
    pc.speed = 45.89;
    pc.mem = 700;
    pc.price = 6000;
    
  }

  public void updateMem(int newMemory) {
    mem += newMemory;
  }

  int getMem() {
    return mem;
  }

}
