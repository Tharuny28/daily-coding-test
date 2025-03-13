class Employee{
	String name;
	
	Employee(String name){
		this.name=name;
	}
	
	void empnames() {
		System.out.println("Employee name :"+name);
	}
}
public class Department {
	Employee employee_name1;
	Employee employee_name2;
	Employee employee_name3;
	
	Department(Employee employee_name1,Employee employee_name2,Employee employee_name3){
		this.employee_name1= employee_name1;
		this.employee_name2=employee_name2;
		this.employee_name3=employee_name3;
	}
	void show() {
		employee_name1.empnames();
		employee_name2.empnames();
		employee_name3.empnames();
	}
	public static void main(String[] args) {
		Employee e = new Employee("Ram");
		Employee f = new Employee("Tharun");
		Employee g = new Employee("Jomesh");
		
		
		Department de = new Department(e, f, g);
		de.show();
	}

}
