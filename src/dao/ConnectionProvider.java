
package dao;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Friver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSl= false","root","hellowin");
        return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
