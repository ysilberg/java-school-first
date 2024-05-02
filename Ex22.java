public class Ex22 {
  private int[] elements;
  private int last;

  public void Stack(int size) {
    elements.length = size;
    last = -1;
  }

  public boolean push(int x) {
    if (top == elements.length - 1) {
      return false;
    }
    elements[++top] = x;
    return true;
  }

  public int pop() {
    int n = 0;
    elements.length = n;
    elements[n] -= elements[n];
  }

  public boolean isEmpty() {
    int c = 0;
    for (int i = 0; i <= elements.length; i++) {
      c += elements[i];
    }
    return c == 0;
  }
}
