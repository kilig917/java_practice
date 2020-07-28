// 同级下的类不需要引用，所以employeetest不用import employee.java也可以用里面的类

public class Employee {
	String name;
	int age;
	String position;
	double salary;

	public Employee(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printEmployee() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Position: " + this.position);
		System.out.println("Salary: " + this.salary);
	}
}