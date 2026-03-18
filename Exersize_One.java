import java.util.Queue;

public class Exersize_One {
  boolean isMirrorNumber(Queue<Integer> q, int m) {
    for (int i = 0; i < m / 2; i++) {
      int prev = q.remove();
      q.add(prev);
      int curr = q.remove();
      q.add(curr);
      int next = q.remove();
      if (i % 2 == 0) {
        int avg = (prev + next) / 2;
        if (curr != avg) {
          return false;
        }
      }
    }
    return true; 
  }

  boolean nMirror(Queue<Integer> q, int m) {
    if (m <= 2) {
      return true; 
    }

    int prev = q.remove();
    q.add(prev);
    int curr = q.remove();
    q.add(curr);
    for (int i = 1; i <= m - 2; i++) {
      int next = q.remove();
      q.add(next);

      if (i % 2 == 0) {
        int avg = (prev + next) / 2;
        if (curr != avg) {
          return false;
        }
      }

      prev = curr;
      curr = next;
    }

    return true;
  }

}