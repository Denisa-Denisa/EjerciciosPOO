package ejercicio11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaListaPeliculas {
	private final static String NOMBRE_ARCHIVO = "titulos.film.dat";
	private final static String SEPARADOR = "|";
	
	public static void guardar(ListaPeliculas peliculas) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(NOMBRE_ARCHIVO);
			bw = new BufferedWriter(fw);
			
			for(ListaPeliculas e : peliculas.getLista()) {
				bw.write(e.getTitulo());
				bw.newLine();
			}
			bw.flush();
		} catch(IOException e) {
			System.out.println(e);
			throw e;
		} finally {
			if (bw!=null) {
				bw.close();
			}
			if (fw!=null) {
				fw.close();
			}
		}
	}
}