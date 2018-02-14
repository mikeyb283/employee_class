
public class Main {
  public static void main(String[] args) {

    //instantiating objects of the Employee class
    Employee employee536 =  new Employee("Button", "Ben", 536, 1);
    Employee employee720 = new Employee("Doe", "Jane", 720, 2);
    Employee employee987 = new Employee("Smith", "John", 987, 3);

    //calling the print method for each employee
    employee536.print();
    employee720.print();
    employee987.print();
  }
}
