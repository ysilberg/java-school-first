public class Person {

  private String name;
  private Address address;

  // Constructor accepting name, city, street, number, and zip
  public Person(String name, String city, String street, int number, int zip) {
    this.name = name;
    this.address = new Address(city, street, number, zip);
  }

  // Constructor accepting name and Address object
  public Person(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Setter for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter for address
  public Address getAddress() {
    return address;
  }

  // Setter for address
  public void setAddress(Address address) {
    this.address = address;
  }

  // toString method for formatted output
  @Override
  public String toString() {
    return name + ", Address: " + address;
  }

  // sameAddress method for address comparison
  public boolean sameAddress(Person other) {
    return getAddress().equals(other.getAddress());
  }
}
