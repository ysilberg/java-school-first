public class Train_Station {
  private int id;
  private int[] lines;
  private int count;

  public Train_Station(int id, int[] lines, int count) {
    this.id = id;
    this.lines = lines;
    this.count = count;
  }

  public boolean isPassingThrough(int lineNum) {
    for (int i = 0; i < count; i++) {
      if (lines[i] == lineNum) {
        return true;
      }
    }
    return false;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int[] getLines() {
    return lines;
  }

  public void setLines(int[] lines) {
    this.lines = lines;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  /**
   * Returns the set of line numbers that stop at every station in the network.
   *
   * @param stations All stations in the network (may be empty)
   * @return an array of line numbers that appear in every station (each line appears once)
   */
  public static int[] allStops(Train_Station[] stations) {
    if (stations == null || stations.length == 0) {
      return new int[0];
    }

    java.util.Set<Integer> commonLines = new java.util.HashSet<>();
    for (int i = 0; i < stations[0].count; i++) {
      commonLines.add(stations[0].lines[i]);
    }

    for (int s = 1; s < stations.length && !commonLines.isEmpty(); s++) {
      Train_Station st = stations[s];
      java.util.Set<Integer> stationLines = new java.util.HashSet<>();
      for (int i = 0; i < st.count; i++) {
        stationLines.add(st.lines[i]);
      }
      commonLines.retainAll(stationLines);
    }

    int[] result = new int[commonLines.size()];
    int idx = 0;
    for (int line : commonLines) {
      result[idx++] = line;
    }
    return result;
  }
}
