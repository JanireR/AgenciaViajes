package clases;

import java.io.*;

public class Usuario {

	public String nombre;
	public String apellido;
	public String dni;
	public String telefono;

	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombre, String apellido, String dni,
			String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
	public boolean validarDNI(String dni){
		return false;
		
	}
	public String toString(){
		return "Nombre: "+ nombre + "Apellido: "+ apellido + "DNI: "+ dni + "Telefono: "+ "telefono";
	}

	public void leerDeFichero(ObjectInputStream ois){}
	public void escribirEnFichero(ObjectOutputStream oos){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
