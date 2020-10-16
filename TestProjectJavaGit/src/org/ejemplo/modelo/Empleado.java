package org.ejemplo.modelo;

//SE CREO LA CLASE EMPLEADO
public class Empleado {
	
	private int id;
	private String nombre;
	
	//SE AGREGO UNA NUEVA ANOTACION
	private String apepat;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApepat() {
		return apepat;
	}
	public void setApepat(String apepat) {
		this.apepat = apepat;
	}

}