package ComparableComparator;

public class Employee implements Comparable<Employee> {
	private Integer id;
	private String name;
	private Integer age;
	private Integer salary;
	public Employee(Integer id, String name, Integer age, Integer salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee employee) {
		return (this.age).compareTo(employee.age);
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
