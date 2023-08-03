package ejercicio2Archivos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

	private static final String FILENAME = "rios.dat";

	public static void main(String[] args) {
		/*
		 * Crea una aplicación que pueda guardar información sobre ríos.
		 * 
		 * Debemos guardar un identificador numérico, el nombre del río, longitud en
		 * metros, lugar de nacimiento. Los ríos no pueden repetirse. Consideramos que
		 * dos ríos son iguales si tienen el mismo identificador.
		 * 
		 * Los ríos se deben guardar en un archivo binario como objetos.
		 * 
		 * 
		 * 
		 */

		List<Rio> rios = new ArrayList<>();
		rios.add(new Rio(1, "Tajo", 4820, "Teruel"));
		rios.add(new Rio(2, "Mnazanares", 5310, "Sierra de Guadarrama"));
		rios.add(new Rio(3, "Ebro", 2500, "Cantabria"));

		guardarRiosEnArchivo(rios);
	}

	private static void guardarRiosEnArchivo(List<Rio> rios) {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
			for (Rio rio : rios) {
				outputStream.writeObject(rio);
			}
			System.out.println("Ríos guardados en el archivo " + FILENAME);
		} catch (IOException e) {
			System.out.println("Error al guardar los ríos en el archivo " + FILENAME);

		}
	}
}
