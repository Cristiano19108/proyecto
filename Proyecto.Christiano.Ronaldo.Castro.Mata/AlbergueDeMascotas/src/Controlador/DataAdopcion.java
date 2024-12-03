package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.Adopcion;

public class DataAdopcion {
	private Conexion cn=new Conexion();
	private Connection con;
	private PreparedStatement ps;
	public boolean Guardar(Adopcion ad) {
		boolean guarda=false;
		String sql="insert into Adopciones values(?,?,?,?,?)";
		con=cn.Conectar();
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, ad.getIdAdopcion());
			ps.setInt(2,ad.getIdAdoptador());
			ps.setInt(3,ad.getIdMascota());
			ps.setString(4,ad.getNombreAdoptador());
			ps.setString(5,ad.getNombreMascota());
			int guar=ps.executeUpdate();
			if(guar>0) {
				guarda=true;
				JOptionPane.showMessageDialog(null,"Guardado con Exito");
			}else {
				JOptionPane.showMessageDialog(null,"Guardado sin Exito");
			}
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null," Error Al Guardar");
		}
		
		return false;
		
	}
}
