package jdbc_prac;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class jdbcc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temp?autoReconnect=true&useSSL=false","root","root");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from student where id=1");
        rs.next();
        String ans=rs.getString("phone");
        System.out.println(ans);
        st.close();
        con.close();
        
        
        		
	}

}
