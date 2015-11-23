package ProjetRegate;

import java.sql.*;

public class Connection
{
    public static void main(String a[]) throws ClassNotFoundException, SQLException
    {
        try
        {
            String url = "jdbc:sqlserver://10.129.181.1:1433;integratedSecurity=true;database=bd_bautz";   
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection conn = DriverManager.getConnection(url);
            System.ou0.println("connection created");
            Statement st=conn.createStatement();
            String sql="select * from Voilier";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                System.out.println("Name: "+rs.getString(1));
                //System.out.println("Address : "+rs.getString(2));
            }
            if(st!=null)
            st.close();
            if(conn!=null)
                conn.close();
        }
        catch(SQLException sqle)
        {
            System.out.println("Sql exception "+sqle);
        }
    }
}
