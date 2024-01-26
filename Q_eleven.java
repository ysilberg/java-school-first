public class Q_eleven {
  private int hours;
  private int minutes;
  private boolean is24;
  private boolean isAM;

  public Q_eleven(int hours, int minutes) {
    this.hours = 12;
    this.minutes = 36;

  }

  public String toString() {
    return hours + ":" + minutes + isAM;
  }

  public void setHours(int h) {
    if (h > 12) {
      h = 0;
    }
  }

  public void setMinutes(int m) {
    m = minutes;
    if (m >= 60) {
      m = m % 60;
    }
  }

  public void switchFormat() {
    if (hours > 12) {
      hours = 24 - hours;
    }
  }

  public boolean isMorning() {
    if (hours < 11) {
      return true;
    }
    return is24;
  }
}
