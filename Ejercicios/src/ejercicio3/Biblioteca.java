package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	 private List<Libro> libros = new ArrayList<>();

	    public void agregarLibro(Libro libro) {
	        libros.add(libro);
	    }

	    public void eliminarLibro(Libro libro) {
	        libros.remove(libro);
	    }

	    public void actualizarLibro(Libro libro, String ISBN, String titulo, String editorial, String autor) {
	        libro.setISBN(ISBN);
	        libro.setTitulo(titulo);
	        libro.setEditorial(editorial);
	        libro.setAutor(autor);
	    }

	    public Libro obtenerLibro(String ISBN) throws IOException, LibroNoEncontradoException {
	        for (Libro libro : libros) {
	            if (libro.getISBN().equals(ISBN)) {
	                return libro;
	            }
	        }
	        throw new LibroNoEncontradoException("El libro no se encuentra en la biblioteca");
	    }

	    public void escribirListaDeLibros() {
	        for (Libro libro : libros) {
	            System.out.println(libro.getISBN() + ", " + libro.getTitulo() + ", " + libro.getEditorial() + ", " + libro.getAutor());
	        }
	    }

	    public void guardarLibrosEnArchivo(String nombreArchivo) throws IOException {
	        BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
	        for (Libro libro : libros) {
	            writer.write(libro.getISBN() + "," + libro.getTitulo() + "," + libro.getEditorial() + "," + libro.getAutor());
	            writer.newLine();
	        }
	        writer.close();
	    }
	    
	    public void recuperarLibrosDeArchivo(String nombreArchivo) throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
	        String linea;
	        while ((linea = reader.readLine()) != null) {
	            String[] partes = linea.split(",");
	            if (partes.length == 4) {
	                Libro libro = new Libro(partes[0], partes[1], partes[2], partes[3]);
	                libros.add(libro);
	            }
	        }
	        reader.close();
	    }
	}
	
	
	
	

