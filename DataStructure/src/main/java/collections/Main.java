package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<City> cities = new ArrayList<City>();

		cities.add(new City("London"));
		cities.add(new City("Montreal"));
		cities.add(new City("New York"));

		cities.stream().forEach(c -> System.out.println(c.getName()));

		/*
		 * Use ArrayList to store the information of 5 Employee 
		 * • Employee has id, name and salary 
		 * • Use stream method in collection class for 
		 * • filtering the Emplyee with salary more than 10000 If it exists print the name 
		 * • Use map method to get all the name of the employee
		 */
		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee("toto1", 1, 1000));
		employees.add(new Employee("toto2", 2, 2000));
		employees.add(new Employee("toto3", 3, 3000));
		employees.add(new Employee("toto4", 4, 10000));
		employees.add(new Employee("toto5", 5, 20000));

		// ctrl + 2(a pause) + L

		ArrayList<Employee> employees2 = (ArrayList<Employee>) employees.stream().filter(e -> e.getSalary() >= 10000)
				.collect(Collectors.toList());

		employees2.stream().forEach(e -> System.out.println(e.getName()));

		// employees.stream().filter(e -> e.getSalary()>=10000).findAny().ifPresent(e ->
		// System.out.println(e.getName()));//just return first

		ArrayList<String> names = (ArrayList<String>) employees.stream().map(e -> e.getName())
				.collect(Collectors.toList());

		names.stream().forEach(n -> System.out.println(n));

		// CTRL + 2 (a pause) + L
		/*
		 * how to convert a ints array to integer AllayList
		 */
		int[] nums = { 10, 20, 30, 40 };

		Arrays.stream(nums).forEach(c -> System.out.print(c + "  "));

		Arrays.stream(nums).boxed().collect(Collectors.toList()).forEach(c -> System.out.print(c + "  "));

		List<Integer> convertedList = Arrays.stream(nums).boxed().collect(Collectors.toList());

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int n : nums) {
			numbers.add(n);
		}
		convertedList.stream().forEach(c -> System.out.print(c + "  "));

		/*
		 * • We have an array of ints = [10, 12, 13, 4]; • Use Arrays.asList () • Use
		 * ArrayList and stream.map • To do n= n*2 for each element
		 */
		List<Integer> collect = numbers.stream().map(num -> num * 2).collect(Collectors.toList());

		collect.forEach(c -> System.out.print(c + "  "));

	}
}
