package clases;

import java.io.*;

public class Usuario {

	public String Nombre;
	public String Apellido;
	public String Dni;
	public String Telefono;

	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String Nombre, String Apellido, String Dni,
			String Telefono) {
		super();
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Dni = Dni;
		this.Telefono = Telefono;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String Npellido) {
		this.Apellido = Apellido;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String Dni) {
		this.Dni = Dni;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String Telefono) {
		this.Telefono = Telefono;
	}

	
	
	public boolean validarDNI(String dni){
		return false;
		
	}
	public String toString(){
		return "Nombre: "+ Nombre + "Apellido: "+ Apellido + "DNI: "+ Dni + "Telefono: "+ "Telefono";
	}

	public void leerDeFichero(ObjectInputStream ois){}
	public void escribirEnFichero(ObjectOutputStream oos){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
