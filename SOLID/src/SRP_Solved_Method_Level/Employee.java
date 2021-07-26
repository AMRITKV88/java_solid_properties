package SRP_Solved_Method_Level;

public class Employee implements IEmployee {

	@Override
	public void AddEmployee() {
		// TODO Auto-generated method stub
		try {
			// Code to add employee to the db;
			System.out.println("Employee adeed");
			SendEmail();
		}
		catch (Exception e) {
			
			LogException(e);
		}
	}

	@Override
	public void DeleteEmployee() {
		
		try {
			// Code to delete employee to the db;
			System.out.println("Employee deleted");
			SendEmail();
			
		}
		catch (Exception e) {
			
			LogException(e);
		}
		
	}

	@Override
	public void SendEmail() {
		
		try {
		// Code to send an e-mail;
		System.out.println("Email sent to the employee");
		
	    }
		catch (Exception e) {
			LogException(e);
		}
	}

	@Override
	public void LogException(Exception e) {

		System.out.println("Exception occured : " + e);
		
	}

	
}
