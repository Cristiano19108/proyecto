package Modelo;

import java.time.LocalDate;

public class Adopcion {
private int IdAdopcion;
private int IdAdoptador;
private int IdMascota;
private LocalDate Fecha;
private String NombreAdoptador;
private String NombreMascota;
public int getIdAdopcion() {
	return IdAdopcion;
}
public void setIdAdopcion(int idAdopcion) {
	IdAdopcion = idAdopcion;
}
public int getIdAdoptador() {
	return IdAdoptador;
}
public void setIdAdoptador(int idAdoptador) {
	IdAdoptador = idAdoptador;
}
public int getIdMascota() {
	return IdMascota;
}
public void setIdMascota(int idMascota) {
	IdMascota = idMascota;
}
public LocalDate getFecha() {
	return Fecha;
}
public void setFecha(LocalDate fecha) {
	Fecha = fecha;
}
public String getNombreAdoptador() {
	return NombreAdoptador;
}
public void setNombreAdoptador(String nombreAdoptador) {
	NombreAdoptador = nombreAdoptador;
}
public String getNombreMascota() {
	return NombreMascota;
}
public void setNombreMascota(String nombreMascota) {
	NombreMascota = nombreMascota;
}
public Adopcion(int idAdopcion, int idAdoptador, int idMascota, LocalDate fecha, String nombreAdoptador,
		String nombreMascota) {
	super();
	IdAdopcion = idAdopcion;
	IdAdoptador = idAdoptador;
	IdMascota = idMascota;
	Fecha = fecha;
	NombreAdoptador = nombreAdoptador;
	NombreMascota = nombreMascota;
}
public Adopcion() {
	super();
	// TODO Auto-generated constructor stub
}

}
