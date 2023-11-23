package pattern.structural.facade;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection(){
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		System.out.println("oracle pdf");
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		System.out.println("oracle html");
	}
	
}
