package ejercicio3b;

public class Ejercicio3 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa para una biblioteca que contenga libros y revistas.
		 * 
		 * Las características comunes que se almacenan tanto para las revistas como
		 * para los libros son el código, el título, y el año de publicación. Estas tres
		 * características se pasan por parámetro en el momento de crear los objetos.
		 * 
		 * Los libros tienen además un atributo prestado. Los libros, cuando se crean,
		 * no están prestados.
		 * 
		 * Las revistas tienen un número. En el momento de crear las revistas se pasa el
		 * número por parámetro.
		 * 
		 * Tanto las revistas como los libros deben tener (aparte de los constructores)
		 * un método toString() que devuelve el valor de todos los atributos en una
		 * cadena de caracteres. También tienen un método que devuelve el año de
		 * publicación, y otro el código.
		 * 
		 * Para prevenir posibles cambios en el programa se tiene que implementar una
		 * interfaz Prestable con los métodos prestar(), devolver() y prestado. La clase
		 * Libro implementa esta interfaz.
		 * 
		 * Desde la aplicación principal debes realizar las siguientes acciones:
		 * 
		 * - Crea varios libros y revistas.
		 * 
		 * - Presta dos libros.
		 * 
		 * - Devuelve un libro.
		 * 
		 * - Comprueba si un libro está prestado.
		 * 
		 * - Lista todos los libros y revistas por consola.
		 * 
		 * 
		 * 
		 */

		System.out.println("BIBLIOTECA: Libros y Revistas \n");

		Libros libro1 = new Libros(1, "La columna", 2023, false);
		Libros libro2 = new Libros(2, "La soledad", 1967, false);
		Revistas revista1 = new Revistas(3, "El poder", 2021);
		Revistas revista2 = new Revistas(4, "La clase", 2010);

		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(revista1);
		System.out.println(revista2);

		System.out.println();

		libro1.prestar();
		libro2.prestar();
		libro1.devolver();

		System.out.println();
		System.out.println("¿Esta el libro 1 prestado? " + libro1.prestado());

	}

}
