package SRP_Issue;

public class Employee implements IEmployee {

	@Override
	public void AddEmployee() {
		// TODO Auto-generated method stub
		try {
			// Code to add employee to the db;
			System.out.println("Employee adeed");
			// Code to send an e-mail;
			System.out.println("Email sent to the employee");
		}
		catch (Exception e) {
			
			System.out.println("Exception occured : " + e);
		}
	}

	@Override
	public void DeleteEmployee() {
		
		try {
			// Code to delete employee to the db;
			System.out.println("Employee deleted");
			// Code to send an e-mail;
			System.out.println("Email sent to the employee");
			
		}
		catch (Exception e) {
			
			System.out.println("Exception occured : " + e);
		}
		
	}
	
}
