import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class RailwayInterfaceImpl implements RailwayInterface {
	
	static Connection con;

	@Override
	public void bookTrain(List<Passenger> lst) {
	
		
		// TODO Auto-generated method stub
		
		/*
		 
		 create table passenger(
		 pid number(10),pname varchar2(20),pdate varchar2(20),pclass varchar2(20), psource varchar2(20), pdestination varchar2(20));
		 
		 
		 );
		 
		 
		 */
		
		
		
		con=DatabaseConnection.getConnection();
		Passenger p=lst.get(0);
		
		int i=0;
		
		
		try {
			PreparedStatement pstate=con.prepareStatement("insert into passenger values(?,?,?,?,?,?)");
			pstate.setInt(1, p.getId());
			
			pstate.setString(2,p.getPname());
			System.out.println("WELCOME"+p.getPname());
			
			pstate.setString(3,p.getPdate());
			pstate.setString(4,p.getPclass());
			pstate.setString(5,p.getPsource());
			pstate.setString(6,p.getPdestination());
			
			i=pstate.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("I am doing booking");
		
		
		
	}

	@Override
	public List<Passenger> getdetails() {
		String str="select * from passenger";
		List<Passenger>lst=new LinkedList<Passenger>();
		try {
			Statement pstate=con.createStatement();
			ResultSet rs=pstate.executeQuery(str);
			
			while(rs.next())
			{
				Passenger p=new Passenger(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(1));
				lst.add(p);
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return lst;
	}

}
