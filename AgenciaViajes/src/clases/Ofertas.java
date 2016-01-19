package clases;

public class Ofertas extends Viajes{

	
	
	public Ofertas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ofertas(String id, String nombreCiudadOrigen,
			String nombreCiudadDestino, String fechaIda, String fechaVuelta) {
		super(id, nombreCiudadOrigen, nombreCiudadDestino, fechaIda, fechaVuelta);
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return super.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ofertas ofertas1 = new Ofertas("002","Barcelona","Sevilla","26/12/2015","29/12/2015");
	}

}
