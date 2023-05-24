package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMethodExample1 {
  

	//
	
	public static void main(String[] args) {
	   List<Employee> employees = Arrays.asList
			   (new Employee("ruhsikesh", 50000.00),
					   new Employee("sachin", 20000.000)
					   ,new Employee("karan", 23000.00),
					   new Employee("ketan", 80000.00),
					   new Employee("sachin", 100000.00));
	   /**
	    * Fileter taking Pradicate it  is functional interfac with boolean test(T t);
	    * 
	    */
	   List<Employee> result = employees.stream().filter((Employee employee)-> employee.getSalary()>50000.00).collect(Collectors.toList());
	   System.out.println(result);
	   
	      
	   
	}
	
}
