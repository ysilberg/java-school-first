public class Runner {
  private String name;
  private int score;

  public int findSmallest(int[] scoreBoard) {
    int smallest = 0;
    for (int i = 0; i <= scoreBoard.length; i++) {
      scoreBoard[i] = smallest;
      if (smallest < scoreBoard[i + 1]) {
        continue;
      }
    }
    return smallest;
  }

}
