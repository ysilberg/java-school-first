public class Book {
  private String name, author;
  private int pages;

  public Book(Book other) {
    name = other.name;
    author = other.author;
    pages = other.pages;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public int getPages() {
    return pages;
  }

  public String toString(String[] books, int[] numOfBooks) {
    StringBuilder sb = new StringBuilder();
    for (String book : books) {
      sb.append(book.toString()).append("\n");
    }
    return "Total books in lib" + numOfBooks.length + sb.toString();
  }

  public boolean addBook(int[] numOfBooks) {
    boolean isFull = true;
    for (int value : numOfBooks) {
      if (value == 0) {
        isFull = false;
        break;
      }
    }
    return true;
  }

  public String getBookByName(String bookName, String[] Books) {
    String result;
    for (String element : Books) {
      if (element.equals(bookName)) {
        result = element;
      }
    }
    if (result == "") {
      return null;
    } else {
      return result;
    }
  }

  public int countAuthor(String author, String[] Books) {
    int result = 0;
    for (String element : Books) {
      if (element.equals(author)) {
        result++;
      }
    }
    return result;
  }

  public int maxPagesBook(int[] pages) {
    if (pages.length == 0) {
      throw new IllegalArgumentException("Array cannot be empty.");
    }

    int max = pages[0];
    for (int i = 1; i < pages.length; i++) {
      if (pages[i] > max) {
        max = pages[i];
      }
    }
    return max;
  }

}
