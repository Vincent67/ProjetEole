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
	
	public static void main(String[] args) {
		
		 Connection conn = null;
		 
        try {
 
        	DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String dbURL = "jdbc:sqlserver://10.129.181.1;integratedSecurity=true;database=bd_bautz";
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                /*DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());*/
            	Statement s = conn.createStatement();
            	ResultSet rs = s.executeQuery("SELECT * FROM Voilier");
            	while (rs.next()) {
            	    System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
            	}
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
	}
	
}
