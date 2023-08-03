package ejercicio1;

import java.util.Random;

public class Contador {

	  private final int VALOR_INICIAL_POR_DEFECTO=0;
	  private int valorInicial;
	  
	  
	    public Contador() {
	        this.valorInicial = VALOR_INICIAL_POR_DEFECTO;
	    }

	    public Contador(int valorInicial) {
	        this.valorInicial = valorInicial;
	    }

	    public int getValorInicial() {
	        return this.valorInicial;
	    }
	    
	    public void setValorInicial(int valor) {
			this.valorInicial = valor;
		}

	    
		public void incrementar() {
	        this.valorInicial++;
	    }

	    public void decrementar() {
	        this.valorInicial--;
	    }
       

	   public String toString() {
		   return "El contador es:" + valorInicial; 
	    }

	   
			
	
}
