package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	
	private Connection connect;
	private ResultSet result;
	private Statement statement;
	
	private static String hostName = "localhost";
	private static String sqlInstanceName = "SQLEXPRESS";
    private static String database = "FLASH_FOOD";
    
//    Chỉnh sửa lại user_name và password của phần mềm sql server ở đây.
    private static String userName = "SA";
    private static String password = "do@1230.com";
    
    public Connect() throws SQLException  {
    	String connectionURL = "jdbc:sqlserver://" + hostName + ":1433"
  	             + ";instance=" + sqlInstanceName + ";databaseName=" + database;
  	 
   		connect = DriverManager.getConnection(connectionURL, userName, password);
  	     
   		statement = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }
    
    
    
}
