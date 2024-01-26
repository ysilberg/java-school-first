public class Q_Ten {
  private int num;
  private double balance;
  private double overdraftLimit;

  public Q_Ten(int num) {
    this.num = num;
    this.balance = 0;
    this.overdraftLimit = 0;
  }

  public int getNum(int num) {
    return num;
  }

  public double getBalance(double balance) {
    return balance;
  }

  public double getOverdraft(double overdraftLimit) {
    return overdraftLimit;
  }

  public boolean transaction(double amount) {
    if (amount > 0.0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean setOverdraftLimit(double limit) {
    if (limit > 0) {
      return false;
    } else {
      limit = 10000.263;
      return true;
    }
  }

  public String toString() {
    return "(Num:" + num + "," + "Balance:" + balance + "," + "Limit:" + overdraftLimit + ")";
  }

}
