package test;
import java.sql.*;
public class InsertDAOR
{
	public int k=0;
	public int insert(UserBean ub)
	{
		try
		{
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("insert into userreg49 values(?,?,?,?,?,?,?)");
		
		ps.setString(1, ub.getuName());
		ps.setString(2, ub.getpWord());
		ps.setString(3, ub.getfName());
		ps.setString(4, ub.getlName());
		ps.setString(5, ub.getAddr());
		ps.setString(6, ub.getMailId());
		ps.setLong(7, ub.getPhNo());
		
		k=ps.executeUpdate();
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
     }
}
