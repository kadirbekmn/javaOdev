
public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManageer = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManageer.GiveCredit();
		
		
	}

}
