package DAO.Implenetation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.SingletonConnection;
import DAO.interfaces.IParticipation;
import Models.ParticipationB;
import Models.ParticipationF;

public class ParticipationImpl implements IParticipation {

	@Override
	public ParticipationF insertParticipationF(ParticipationF partf) {
		
		Connection connection= SingletonConnection.getConnection();
		try{
	        
	    	 PreparedStatement ps= connection.prepareStatement("INSERT INTO ParticipationF(id_part_donateur,id_part_demande,montant_part) values (?,?,?)");
	         ps.setInt(1,partf.getId_part_donateur());
	         ps.setInt(2,partf.getId_part_demande());
	         ps.setDouble(3,partf.getMontant_part());
	        
	         
	        
	        
	         
	         ps.executeUpdate();
	         
	         PreparedStatement ps2=connection.prepareStatement("SELECT MAX(id_part_f) AS MAX_ID FROM PARTICIPATIONF");
	         ResultSet rs=ps2.executeQuery();
	         if(rs.next()) {
	        	 partf.setId_partF(rs.getInt("MAX_ID"));
	         }
	         ps.close();
	         
	     }catch(SQLException e){
	         e.printStackTrace();
	     }
		return partf;
		
	}

	@Override
	public ParticipationB insertParticipationB(ParticipationB partb) {

		Connection connection= SingletonConnection.getConnection();
		try{
	        
	    	 PreparedStatement ps= connection.prepareStatement("INSERT INTO ParticipationB(id_part_donateur,id_part_demande,montant_part,benevole_part) values (?,?,?,?)");
	         ps.setInt(1,partb.getId_part_donateur());
	         ps.setInt(2,partb.getId_part_demande());
	         ps.setInt(4,partb.getBenevole_part());
	         
	        
	        
	         
	         ps.executeUpdate();
	         
	         PreparedStatement ps2=connection.prepareStatement("SELECT MAX(id_part_b) AS MAX_ID FROM PARTICIPATIONB");
	         ResultSet rs=ps2.executeQuery();
	         if(rs.next()) {
	        	 partb.setId_partB(rs.getInt("MAX_ID"));
	         }
	         ps.close();
	         
	     }catch(SQLException e){
	         e.printStackTrace();
	     }
		return partb;
	}

}
