package ejercicio2;

public class BicicletaCarretera extends Bicicleta{

		
	 protected int numVelocidades;

	    public BicicletaCarretera(String color, int tamanoRuedas, int numVelocidades) {
	        super(color, tamanoRuedas);
	        this.numVelocidades = numVelocidades;
	        this.precioBase += numVelocidades * 15.0;
	    }

	    public int getNumVelocidades() {
	        return numVelocidades;
	    }
	    
	 
	    public double precioFinal() {
		       double total = precioBase + (15 * numVelocidades);
		       return total; 
		    }

		    
		    public String toString() {
				return "La bicicleta de carretera " +  " de color " + color + 
					   "\" tiene " + numVelocidades + " velocidades";
			}
	}
	

	
	
	
	

