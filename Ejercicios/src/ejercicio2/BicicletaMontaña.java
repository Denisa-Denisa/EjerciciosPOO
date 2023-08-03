package ejercicio2;

public class BicicletaMontaña extends Bicicleta{


	 private int numPlatos;

	    public BicicletaMontaña(String color, int tamanoRuedas, int numPlatos) {
	        super(color, tamanoRuedas);
	        this.numPlatos = numPlatos;
	        this.precioBase += numPlatos * 50.0;
	    }

	    public int getNumPlatos() {
	        return numPlatos;
	    }
	    
	    
	    
	    public double precioFinal() {
	       double total = precioBase + (50 * numPlatos);
	       return total; 
	    }

	    
	    public String toString() {
			return "La bicicleta de montaña " +  " de color " + color + 
				   "\" tiene " + numPlatos + " platos";
		}
	}

	

	
	


	
	
	

