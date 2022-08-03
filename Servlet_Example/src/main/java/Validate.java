import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
	public static boolean checkUser(String name,String pass) 
    {
        boolean st =false;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingdb","root","Ftdbs@2022");
            PreparedStatement ps = con.prepareStatement("select * from register where name=? and password=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs =ps.executeQuery();
            st = rs.next();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    } 
}
