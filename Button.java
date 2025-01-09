public class Button {

  // Private fields
  private int num;
  private int size;
  private String color;

  public Button(int num) {
    this.num = num;
    this.size = 0;
    this.color = "Unknown";
  }

  public Button(int num, int size, String color) {
    this.num = num;
    this.size = size;
    this.color = color;
  }

  int getSize() {
    return size;
  }

  public void addToSize(int x) {
    this.size += x;
  }

  public Boolean isSameSize(Button other) {
    return this.size == other.size;
  }
}
