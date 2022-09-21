
public class EmpDriver {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1985, 45, 2000.0, "Kadir");
			System.out.println(emp1.tax());
			System.out.println(emp1.bonus());
			System.out.println(emp1.incrase());
			double totalSalary = emp1.salary - emp1.tax() + emp1.bonus();
			System.out.println("Total salary with tax and bonus : " + totalSalary);
			System.out.println("Total salary with the raise of the salary : " + (emp1.salary + emp1.incrase()));	
	}
}
