package SRP_Solved_Class_Level;

public class Logger implements ILogger{

	@Override
	public void LogException(Exception e) {

		System.out.println("Exception occured : " + e);
	}

}
