/*Interfaz para los ficheros */

package clases;

import java.io.*;

public interface Archivable {
	
	void leerDeFichero(ObjectInputStream ois);
	void escribirEnFichero(ObjectOutputStream oos);

}
