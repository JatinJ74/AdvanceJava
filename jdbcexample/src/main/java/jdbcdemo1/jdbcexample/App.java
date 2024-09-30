package jdbcdemo1.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       
       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db","root","Jatin123");
        
       PreparedStatement statement = connection.prepareStatement("Select * from new_table");
       
       ResultSet set = statement.executeQuery();
       
       while(set.next()) {
    	   System.out.println("_____________");
    	   System.out.println("t_no:" + set.getInt(1));
    	   System.out.println("name:" + set.getString(2));
    	   System.out.println("____________");
       }
    }
}
