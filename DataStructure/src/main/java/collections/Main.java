package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<City> cities = new ArrayList<City>();
		
		cities.add(new City("London"));
		cities.add(new City("Montreal"));
		cities.add(new City("New York"));		

		cities.stream().forEach(c->System.out.println(c.getName()));
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("toto1", 1, 1000));
		employees.add(new Employee("toto2", 2, 2000));
		employees.add(new Employee("toto3",3, 3000));
		employees.add(new Employee("toto4", 4, 10000));
		employees.add(new Employee("toto5", 5, 20000));
		//ctrl + 2(a pause) + L
		
		
		ArrayList<Employee> employees2 = (ArrayList<Employee>) employees.stream().filter(e -> e.getSalary()>=10000).collect(Collectors.toList());
		
		
		employees2.stream().forEach(e -> System.out.println(e.getName()));
		
		//employees.stream().filter(e -> e.getSalary()>=10000).findAny().ifPresent(e -> System.out.println(e.getName()));//just return first 
		
		ArrayList<String> names = (ArrayList<String>) employees.stream().map(e -> e.getName()).collect(Collectors.toList());
		
		names.stream().forEach(n -> System.out.println(n));
		
		int[] ints = {1,2,3,4};
		List<Integer> list = new ArrayList<Integer>();
		
	}
	
	
}
