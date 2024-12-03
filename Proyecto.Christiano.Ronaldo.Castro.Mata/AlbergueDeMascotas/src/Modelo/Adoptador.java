package Modelo;

public class Adoptador {
	private int IdAdoptador;
	private int IdAdopcion;
	private int IdMascota;
	private String Nombre;
	private String Apellido;
	private String Domicilio;
	private String MascotaAdoptada;
	public int getIdAdoptador() {
		return IdAdoptador;
	}
	public void setIdAdoptador(int idAdoptador) {
		IdAdoptador = idAdoptador;
	}
	public int getIdAdopcion() {
		return IdAdopcion;
	}
	public void setIdAdopcion(int idAdopcion) {
		IdAdopcion = idAdopcion;
	}
	public int getIdMascota() {
		return IdMascota;
	}
	public void setIdMascota(int idMascota) {
		IdMascota = idMascota;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDomicilio() {
		return Domicilio;
	}
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
	public String getMascotaAdoptada() {
		return MascotaAdoptada;
	}
	public void setMascotaAdoptada(String mascotaAdoptada) {
		MascotaAdoptada = mascotaAdoptada;
	}
	public Adoptador(int idAdoptador, int idAdopcion, int idMascota, String nombre, String apellido, String domicilio,
			String mascotaAdoptada) {
		super();
		IdAdoptador = idAdoptador;
		IdAdopcion = idAdopcion;
		IdMascota = idMascota;
		Nombre = nombre;
		Apellido = apellido;
		Domicilio = domicilio;
		MascotaAdoptada = mascotaAdoptada;
	}
	public Adoptador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
