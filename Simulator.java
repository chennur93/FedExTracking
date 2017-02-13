import java.sql.SQLException;
import java.sql.Statement;

public class Simulator extends Thread {

	public void run() {
        System.out.println("Hello from a thread!");
    }
	
	public void updateTransitPath() throws SQLException
	{
		ConnectionManager path=new ConnectionManager();
		Statement sql= path.getConnectionManager().createStatement();
		String cities="charlotte, Atlanta, Raleigh, Dellas";
		
	}
	
	
}
