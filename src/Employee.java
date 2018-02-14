
public class Employee {

  //class definition
  private String lastName;
  private String firstName;
  private int    employeeID;
  private int    shiftWorked;

  //default constructor
  public Employee(String lastName, String firstName, int employeeID, int shiftWorked) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.employeeID = employeeID;
    this.shiftWorked = shiftWorked;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public int getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }

  public int getShiftWorked() {
    return shiftWorked;
  }

  public void setShiftWorked(int shiftWorked) {
    this.shiftWorked = shiftWorked;
  }
/*
Method: print

Use: To format and display the employee information

Return: void
 */
  public void print() {
    System.out.println("\nEmployee ID\t\tLast Name\t\tFirst Name\t\tShift Worked");
    System.out.printf("%7s", getEmployeeID());
    System.out.printf("%15s", getLastName());
    System.out.printf("%15s", getFirstName());
    System.out.printf("%15s", "(" + getShiftWorked() + ")\n") ;
  }
}
