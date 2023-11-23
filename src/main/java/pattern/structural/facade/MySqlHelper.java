package pattern.structural.facade;

import java.sql.Connection;

public class MySqlHelper {
	
	public static Connection getMySqlDBConnection(){
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con){
		System.out.println("mysql pdf");
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		System.out.println("mysql html");
	}
}