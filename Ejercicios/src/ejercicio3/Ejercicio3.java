package ejercicio3;

import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) throws Exception {
		/*
		 * Crea una aplicación para llevar el inventario de libros de una biblioteca.
De los libros solo se quiere saber el ISBN, título, editorial, autor.
- Se debe poder crear, eliminar, actualizar y obtener un libro.
- También se debe poder escribir la lista de libros por consola.
- Los libros deben guardarse en un archivo de texto.
- Se debe lanzar una exception LibroNoEncontradoException cuando no existe el libro, por ejemplo cuando se intenta eliminar o recuperar un libro que no existe.
En el programa principal deberás probar a:
- Añadir un libro a la biblioteca.
- Eliminar un libro de la biblioteca.
- Actualizar un libro de la biblioteca.
- Recuperar un libro de la biblioteca.
- Escribir por consola un libro.
- Escribir todos los libros por consola.
- Guardar todos los libros de la biblioteca en un archivo de texto.
- Recuperar todos los libros de un archivo de texto.
No hay que hacer una interfaz de usuario.
 
		 */

		Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("5246", "La niña", "Editorial Planeta", "Federico Roca");
        biblioteca.agregarLibro(libro1);

   
        Libro libro2 = new Libro("698746", "El lago azul", "Elvive", "Andrea Gonzalez");
		biblioteca.eliminarLibro(libro2);

       
        try {
            Libro libro3 = biblioteca.obtenerLibro("5246");
            biblioteca.actualizarLibro(libro3, "5246", "La niña", "Editorial Planeta", "Federico Roca");
        } catch (LibroNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
   
        try {
            Libro libro4 = biblioteca.obtenerLibro("5246");
            System.out.println("Libro recuperado: " + libro4.getISBN() + ", " + libro4.getTitulo() + ", " + libro4.getEditorial() + ", " + libro4.getAutor());
        } catch (LibroNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

      
        try {
            Libro libro5 = biblioteca.obtenerLibro("5246");
            System.out.println("Libro: " + libro5.getISBN() + ", " + libro5.getTitulo() + ", " + libro5.getEditorial() + ", " + libro5.getAutor());
        } catch (LibroNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

       
        biblioteca.escribirListaDeLibros();

    
        try {
            biblioteca.guardarLibrosEnArchivo("biblioteca.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

     
        try {
            biblioteca.recuperarLibrosDeArchivo("biblioteca.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

		
		
		
		
		
		
		
		
		
	}


