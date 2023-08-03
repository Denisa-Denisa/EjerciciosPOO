package ejercicio1;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 *  
Crea una clase que simule un contador.
El contador tendrá dos formas de instanciarse, una por defecto con el valor a 0 y otra donde se le indique el valor inicial.
Debe tener métodos para poder incrementar y decrementar el contador, y que devuelva el valor actual del contador.
En el programa principal genera número aleatorios y usando el contador cuenta cuantos son múltiplos de 10 y escribe en la consola el resultado.
Aplica programación orientada a objetos para realizar la aplicación.

		 */
		
		
		
		    Random r = new Random();
	        Contador contador = new Contador(0);

	      
	        
	        
	        int multiplosDe10 = 0;

	        for (int i = 0; i < 1000; i++) {
	            int numeroAleatorio = r.nextInt(1000);
	            

	            if (numeroAleatorio % 10 == 0) {
	                contador.incrementar();
	                multiplosDe10++;
	            }
	        }
	        
	    

	       
	        System.out.println("Multiplos de 10: " + multiplosDe10);
	        System.out.println("Valor actual: " + contador.getValorInicial());
	    }
	
		

	}


