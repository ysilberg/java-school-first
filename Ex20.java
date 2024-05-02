import java.util.HashSet;
import java.util.Set;

public class Ex20 {
  public static boolean twoNumbers(int[] a, int num) {

    Set<Integer> seen = new HashSet<>();

    for (int element : a) {

      int complement = num - element;
      if (seen.contains(complement)) {
        return true;
      }
      seen.add(element);
    }

    return false;
  }

}
