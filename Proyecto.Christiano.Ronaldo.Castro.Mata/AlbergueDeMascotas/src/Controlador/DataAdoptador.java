package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.Adoptador;

public class DataAdoptador {
	private Conexion cn=new Conexion();
	private Connection con;
	private PreparedStatement ps;
	public boolean Guardar(Adoptador ado) {
		boolean guarda=false;
		String sql="insert into Adoptadores values(?,?,?,?,?,?,?)";
		con=cn.Conectar();
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, ado.getIdAdoptador());
			ps.setInt(2,ado.getIdAdopcion());
			ps.setInt(3,ado.getIdMascota());
			ps.setString(4,ado.getNombre());
			ps.setString(5,ado.getApellido());
			ps.setString(6,ado.getDomicilio());
			ps.setString(7,ado.getMascotaAdoptada());
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
