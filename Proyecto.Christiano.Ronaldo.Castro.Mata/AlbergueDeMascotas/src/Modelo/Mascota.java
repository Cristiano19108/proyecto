package Modelo;

public class Mascota {
	private int IdMascota;
	private String Nombre;
	private String Sexo;
	private int Edad;
	private String Raza;
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
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getRaza() {
		return Raza;
	}
	public void setRaza(String raza) {
		Raza = raza;
	}
	public Mascota(int idMascota, String nombre, String sexo, int edad, String raza) {
		super();
		IdMascota = idMascota;
		Nombre = nombre;
		Sexo = sexo;
		Edad = edad;
		Raza = raza;
	}
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
