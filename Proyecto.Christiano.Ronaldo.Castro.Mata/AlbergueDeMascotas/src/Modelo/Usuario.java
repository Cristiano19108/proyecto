package Modelo;

public class Usuario {
private int IdUsuario;
private String NombreUsuario;
private String Contraseña;
public int getIdUsuario() {
	return IdUsuario;
}
public void setIdUsuario(int idUsuario) {
	IdUsuario = idUsuario;
}
public String getNombreUsuario() {
	return NombreUsuario;
}
public void setNombreUsuario(String nombreUsuario) {
	NombreUsuario = nombreUsuario;
}
public String getContraseña() {
	return Contraseña;
}
public void setContraseña(String contraseña) {
	Contraseña = contraseña;
}
public Usuario(int idUsuario, String nombreUsuario, String contraseña) {
	super();
	IdUsuario = idUsuario;
	NombreUsuario = nombreUsuario;
	Contraseña = contraseña;
}
public Usuario() {
	super();
	// TODO Auto-generated constructor stub
}

}
