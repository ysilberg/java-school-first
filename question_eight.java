import java.util.Scanner;
public class question_eight{

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int x = in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();
      int s = x + y + z;
      int e =  sqrt(s);
      System.out.println(s/3);
      System.out.println(e);
      s = x/(s-z);
      System.out.println(s);
    }
    }

  private static int sqrt(int s) {
    return 0;
  }

  

  
  }
  