package StreamApi;

public class Employee {
   private String name;
   private Double Salary;
   
   public Employee(String name,Double salary) {
	  this.name=name;
	  this.Salary=salary;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getSalary() {
	return Salary;
}

public void setSalary(Double salary) {
	Salary = salary;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", Salary=" + Salary + "]";
}
   
   
}
