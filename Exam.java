public class Exam {

  private String courseName;
  private Date examDate;

  private Exam(String name, Date d) {
    this.courseName = name;
    this.examDate = d;
  }

  public Exam(String name, int day, int month, int hour) {
    Date date1 = new Date(name, day, month, hour);

  }

  public Exam(Exam other) {
    this.courseName = other.courseName;
    this.examDate = other.examDate;
  }

  public String Get_examDate(Date examDate) {
    return examDate;
  }

  public String Get_courseName(String courseName) {
    return courseName;
  }

  public void Set_courseName() {
    this.examDate = examDate;
  }

  public void Set_examDate() {
    this.courseName = courseName;
  }

  public boolean sameDate(Exam other) {
    return this.date.equals(other.date);
  }

  public boolean before(Exam other) {
    return this.date.compareTo(other.date) < 0;
  }

  public boolean differentSemesters(Exam other) {
        // Splitting the dates to extract the year
        String[] thisDateParts = this.date.split("/");
        String[] otherDateParts = other.date.split("/");

       
    
}
