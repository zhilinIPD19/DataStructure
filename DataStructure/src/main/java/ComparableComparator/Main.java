package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	List<Employee> employees = new ArrayList<Employee>();
	employees.add(new Employee(1,"toto1",22,10000));
	employees.add(new Employee(2,"toto2",43,20000));
	employees.add(new Employee(3,"toto3",34,30000));
	employees.add(new Employee(4,"toto4",45,40000));
	employees.add(new Employee(5,"toto5",44,50000));
	
	Collections.sort(employees);
	
	
}
}
