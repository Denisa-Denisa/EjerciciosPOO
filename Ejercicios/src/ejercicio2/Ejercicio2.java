package ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Crea una aplicación en el que se puedan gestionar una lista de bicicletas. Hay dos tipos de bicicletas:
- Las bicicletas de montaña. Debemos saber su color, el tamaño de ruedas en pulgadas y el número de platos.
- Las bicicletas de carretera. Debemos saber su color, tamaño de ruedas en pulgadas y cuantas velocidades tiene.
El precio base de las bicicletas es de 100€. Las bicicletas de montaña, además, incrementan el precio a 50 € por plato que tenga. Las bicicletas de carretera incrementan su precio en 15 € por velocidad.
El color de la bicicleta pueden ser: rojo, negro, blanco o azul.
En la clase principal crea varias bicicletas. Solo debe dejar de crear bicicletas de montaña o de carretera.
Escribe el precio total de cada bicicleta y su datos.
También se debe poder comprobar que bicicleta es la más cara y la más barata de todas.
Aplica programación orientada a objetos para realizar la aplicación.
		 * 
		 * 
		 */

		
		
		ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();

        bicicletas.add(new BicicletaMontaña("azul", 28, 2));
        bicicletas.add(new BicicletaMontaña("granate", 25, 4));
        bicicletas.add(new BicicletaCarretera("dorado", 26, 23));
        bicicletas.add(new BicicletaCarretera("blanco", 29, 15));

        double precioMasAlto = Double.MIN_VALUE;
        double precioMasBajo = Double.MAX_VALUE;
        Bicicleta masCara = null;
        Bicicleta masBarata = null;

        for (Bicicleta bicicleta : bicicletas) {
            double precio = bicicleta.getPrecio();
            if (precio > precioMasAlto) {
                precioMasAlto = precio;
                masCara = bicicleta;
                
            }
            if (precio < precioMasBajo) {
                precioMasBajo = precio;
                masBarata = bicicleta;
               
            }
            
            
            
            System.out.println(bicicleta + " con ruedas de " + bicicleta.getTamanoRuedas() + " pulgadas.");
           
         
            System.out.println("Precio: " + precio + "€");
            System.out.println("-----------------------");
        }
            System.out.println("La bicicleta más cara es de color " + masCara.getColor() + " y tiene un precio de " + precioMasAlto + "€");
            System.out.println("La bicicleta más barata es de color " + masBarata.getColor() + " y tiene un precio de " + precioMasBajo + "€");
            
            }

	 
		
            }	
		
	


