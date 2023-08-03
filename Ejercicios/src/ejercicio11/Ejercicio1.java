package ejercicio11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Crea una aplicación que pida por teclado títulos de películas y guárdalos directamente en una archivo de texto llamado “titulos.film” (sin guardarlos previamente en una lista o array).
         * La entrada de los datos termina cuando se escriba “FIN”.
         * La aplicación cuando arranca deberá escribir por consola los títulos de las películas que hay en el archivo, si existe, y el total. Luego, pedir más títulos de películas.
		 * 
		 * 
		 */
		
		
		    File archivo = new File("titulos.film.dat");
		    int totalTitulos = 0;
	        
	        if(archivo.exists()) {
	            Scanner scanner = null;
	            
	            try {
	            	
	            	System.out.println("Total de titulos guardados en el archivo: " + totalTitulos);
	                scanner = new Scanner(archivo);
	                while(scanner.hasNextLine()) {
	                    String titulo = scanner.nextLine();
	                    totalTitulos++;
	                }
	                
	            } catch(IOException e) {
	                System.out.println("Hay un problema con el archivo: ");
	              
	              
	            } finally {
	                if(scanner != null) {
	                    scanner.close();
	                }
	            }
	        } else {
	            System.out.println("El archivo \"titulos.film.dat\" no existe.");
	            
	        }
	        
	        Scanner scanner = new Scanner(System.in);
	        FileWriter writer = null;
	        String titulo = "";
	        
	        try {
	            writer = new FileWriter("titulos.film.dat", true);
	            while(!titulo.equalsIgnoreCase("FIN")) {
	                System.out.print("Introduce el titulo de una pelicula (FIN para terminar): ");
	                titulo = scanner.nextLine();
	                if(!titulo.equalsIgnoreCase("FIN")) {
	                    writer.write(titulo + "\n");
	                    System.out.println("Titulo de la película introducida: " + titulo);
	                    totalTitulos++;
	                }	         
	            }
	            
	            System.out.println("Total de titulos guardados en el archivo: " + totalTitulos);
	            
	           
	        } catch(IOException e) {
	            System.out.println("Se ha producido un error al escribir en el archivo.");
	           
	        } finally {
	            if(writer != null) {
	                try {
	                    writer.close();
	                } catch (IOException e) {
	        			System.out.println("Hay un problema con el archivo: " + e.getMessage());
	        		}
	                }
	            }
	        }
	        
	    	    
	}
