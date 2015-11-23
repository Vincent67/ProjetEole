package ProjetRegate;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectSQL {
	// http://www.codejava.net/java-se/jdbc/connect-to-microsoft-sql-server-via-jdbc
	// http://stackoverflow.com/questions/957700/how-to-set-the-java-library-path-from-eclipse/958074#958074
	
	 private Connection conn = null;
	 private static String dbURL = "jdbc:sqlserver://10.129.181.1;integratedSecurity=true;database=bd_bautz";
	 private Statement s;
	 private ResultSet rs;
	 
	 

	public ConnectSQL(){
		 
		 try {
	        	DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
	            
	            conn = DriverManager.getConnection(dbURL);
	            if (conn != null) {
	                /*DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
	                System.out.println("Driver name: " + dm.getDriverName());
	                System.out.println("Driver version: " + dm.getDriverVersion());
	                System.out.println("Product name: " + dm.getDatabaseProductName());
	                System.out.println("Product version: " + dm.getDatabaseProductVersion());*/
	            	s = conn.createStatement();
	            }
	            
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }  
		}
	 
	 public void FermetureBDD(){
		 
		 try {
             if (conn != null && !conn.isClosed()) {
                 conn.close();
             }
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
	 }
	 
	 public String RqSQL(String rq) {
		 try {
			 rs = s.executeQuery(rq);
		 } catch (SQLException ex) {
			 ex.printStackTrace();
		 }
		return rq;
	 }

	 public ResultSet getRs() {
		return rs;
	}
	 
	 
	public static void main(String[] args) {
		
		ConnectSQL test = new ConnectSQL();
		test.RqSQL("Select * From Voilier");
		
		try {
			while(test.getRs().next()) {
				System.out.println(test.getRs().getString(1) + test.getRs().getString(2) + test.getRs().getString(3) + test.getRs().getString(4));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		test.FermetureBDD();
	}
}