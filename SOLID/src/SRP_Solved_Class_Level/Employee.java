package SRP_Solved_Class_Level;

public class Employee implements IEmployee {
	
	ILogger objLogger;
	IMailer objMailer;
	
	public Employee() {
		
		objLogger = new Logger();
		objMailer = new Mailer();
	}

	@Override
	public void AddEmployee() {

		try {
			// Code to add employee to the db;
			System.out.println("Employee adeed");
			objMailer.SendEmail();
		}
		catch (Exception e) {
			
			objLogger.LogException(e);
		}
	}

	@Override
	public void DeleteEmployee() {
		
		try {
			// Code to delete employee to the db;
			System.out.println("Employee deleted");
			objMailer.SendEmail();
			
		}
		catch (Exception e) {
			
			objLogger.LogException(e);
		}
		
	}	
}
