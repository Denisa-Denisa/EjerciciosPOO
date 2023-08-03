package ejercicio2b;

import java.util.Date;

public class PanelInformacion {

	    private int id;
	    private Date salida;
	    private Date llegada;
	    private String destino;

	
	   
	   
	    public PanelInformacion(int id, Date salida, Date llegada, String destino) {
			super();
			this.id = id;
			this.salida = salida;
			this.llegada = llegada;
			this.destino = destino;
		}

		public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public Date getSalida() {
	        return salida;
	    }

	    public void setSalida(Date salida) {
	        this.salida = salida;
	    }

	    public Date getLlegada() {
	        return llegada;
	    }

	    public void setLlegada(Date llegada) {
	        this.llegada = llegada;
	    }

	    public String getDestino() {
	        return destino;
	    }

	    public void setDestino(String destino) {
	        this.destino = destino;
	    }
	    
	    
	    
	}
	


