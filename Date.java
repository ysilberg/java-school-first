public class Date {
  private int day;
  private int month;
  private int year;

  public void Date(int d, int m, int y) {
    day = d;
    month = m;
    year = y;

    if (year <= 0 || month <= 0 || day <= 0) {
      year = 1;
      month = 1;
      day = 1;
    }

  }

  public Date(Date other) {
    this.day = other.day;
    this.month = other.day;
    this.year = other.day;

  }

  public String toString() {

    return "(" + day + "/" + month + "/" + year + ")";
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  // Setter methods
  public void setDay(int day) {
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public boolean equals(Date d) {
    if (Date.d == this.day) {
      return true;
    } else {
      return false;
    }

  }

  public boolean before(Date d) {
    if (this.day > d) {
      return true;

    } else {
      return false;
    }

  }

  public boolean after(Date d) {
    if (this.day < d) {
      return true;
    } else {
      return false;
    }

  }

}
