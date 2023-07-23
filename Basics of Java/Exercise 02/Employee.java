public class Employee{
  public static final int MAX_AGE=100; //Constant variable naming convention
  private String empName;  //Variable naming convention
  private int age;

  public Employee(String name, int age){  //Constructor naming convention
    this.empName=name;
    this.age=age;
  }

  public void setName(String name){  //Method naming convention
    this.empName = name;
  } 

  public int getAge(){  //Method naming convention
    return age;
  }

  public static void main(String args[]){  //Main method naming convention
    Employee emp1 = new Employee("John Doe", 30);
    System.out.println("Employee Name: "+emp1.empName);  //Prints Employee Name
    System.out.println("Employee Age: "+emp1.getAge());  //Prints Employee Age
  }
}