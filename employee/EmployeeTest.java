// main Function is always static
// Java main() method is always static, 
// so that compiler can call it without the creation of an object 
// or before the creation of an object of the class.

// static: a static member can be accessed before instantiating a class 
// When a member is declared static, 
// it can be accessed before any objects of its class are created, 
// and without reference to any object. 
// For example, accessing static method m1() without creating any object of Test class.
// class Test 
// { 
//     // static method 
//     static void m1() 
//     { 
//         System.out.println("from m1"); 
//     } 
  
//     public static void main(String[] args) 
//     { 
//           // calling m1 without creating 
//           // any object of class Test 
//            m1(); 
//     } 
// } 

// Simple meaning of instantiate is creating an object from class.
// Example:
// ClassName obj = new ClassName();

public class EmployeeTest {
	public static void main(String[] args) {
		Employee lili = new Employee("Lili");
		Employee lilei = new Employee("Lilei");

		lili.setAge(18);
		lili.setPosition("Engineer");
		lili.setSalary(120);
		lili.printEmployee();

		lilei.setAge(20);
		lilei.setPosition("Teacher");
		lilei.setSalary(80);		
		lili.printEmployee();
	}
}