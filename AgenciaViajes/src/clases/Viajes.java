package clases;
import java.io.*;
public class Viajes {

	
	public String nombreCiudadOrigen;
	public String nombreCiudadDestino;
	public String fechaInicio;
	public String fechaFin;
	
	
	public Viajes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Viajes(String nombreCiudadOrigen, String nombreCiudadDestino,
			String fechaInicio, String fechaFin) {
		super();
		this.nombreCiudadOrigen = nombreCiudadOrigen;
		this.nombreCiudadDestino = nombreCiudadDestino;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	
	public String getNombreCiudadOrigen() {
		return nombreCiudadOrigen;
	}
	public void setNombreCiudadOrigen(String nombreCiudadOrigen) {
		this.nombreCiudadOrigen = nombreCiudadOrigen;
	}
	public String getNombreCiudadDestino() {
		return nombreCiudadDestino;
	}
	public void setNombreCiudadDestino(String nombreCiudadDestino) {
		this.nombreCiudadDestino = nombreCiudadDestino;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public void leerDeFichero(ObjectInputStream ois){}
	public void escribirEnFichero(ObjectOutputStream oos){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
