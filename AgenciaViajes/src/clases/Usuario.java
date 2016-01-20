package clases;

import java.io.*;

public class Usuario {

	public String Nombre;
	public String Apellidos;
	public String Direccion;
	public String Telefono;
	public String Provincia;

	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String Nombre, String Apellidos, String Direccion,
			String Telefono,String Provincia) {
		super();
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Direccion = Direccion;
		this.Telefono = Telefono;
		this.Provincia = Provincia;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String Direccion) {
		this.Direccion = Direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String Telefono) {
		this.Telefono = Telefono;
	}
		
	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}

	public boolean validarDNI(String dni){
		return false;
		
	}
	public String toString(){
		return "Nombre: "+ Nombre + "Apellido: "+ Apellidos + "Direccion: "+ Direccion + "Telefono: "+ Telefono + "Provincia: "+ Provincia;
	}

	public void leerDeFichero(ObjectInputStream ois){}
	public void escribirEnFichero(ObjectOutputStream oos){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
