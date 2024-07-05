package ie.atu.sw;



public class Employee {
    private String name;
    private int id;
    private double salary;
	

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
   public String toString() {
        return "Employee: \n Name='" + name + "', \n Id=" + id + ", \n Salary= €" + salary + "";
   }
}
