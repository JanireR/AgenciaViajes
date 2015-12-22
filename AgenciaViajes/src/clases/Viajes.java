package clases;
import java.io.*;
public class Viajes {

	public int id;
	public String nombreCiudadOrigen;
	public String nombreCiudadDestino;
	public String fechaIda;
	public String fechaVuelta;
	
	
	public Viajes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Viajes(int id, String nombreCiudadOrigen, String nombreCiudadDestino,
			String fechaIda, String fechaVuelta) {
		super();
		this.id = id;
		this.nombreCiudadOrigen = nombreCiudadOrigen;
		this.nombreCiudadDestino = nombreCiudadDestino;
		this.fechaIda = fechaIda;
		this.fechaVuelta = fechaVuelta;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getFechaIda() {
		return fechaIda;
	}
	public void setFechaIda(String fechaIda) {
		this.fechaIda = fechaIda;
	}
	public String getFechaVuelta() {
		return fechaVuelta;
	}
	public void setFechaVuelta(String fechaVuelta) {
		this.fechaVuelta = fechaVuelta;
	}
	public void leerDeFichero(ObjectInputStream ois){}
	public void escribirEnFichero(ObjectOutputStream oos){}
	
	
	
	public String toString(){
		return " ID: " + id + " Ciudad Origen: "+ nombreCiudadOrigen + ", Ciudad Destino: "+ nombreCiudadDestino + ", Fecha ida: "+ fechaIda + ", Fecha vuelta: "+ fechaVuelta;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
