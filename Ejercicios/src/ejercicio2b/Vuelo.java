package ejercicio2b;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Vuelo {

	private int id;
    private String salida;
    private String llegada;
    private String destino;
    private int duracion; 

    public Vuelo(int id, String salida, String llegada, String destino) {
        this.id = id;
        this.salida = salida;
        this.llegada = llegada;
        this.destino = destino;
        this.duracion = duracion; 
    }

    public int getId() {
        return id;
    }

    public String getSalida() {
        return salida;
    }

  

    public String getDestino() {
        return destino;
    }

	

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
    
	public int getDuracion() {
		    LocalDateTime fechaSalida = LocalDateTime.parse(salida, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	        LocalDateTime fechaLlegada = LocalDateTime.parse(llegada, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	        return (int) ChronoUnit.MINUTES.between(fechaSalida, fechaLlegada);
	        
	    }
	
	
	public String getLlegada() {
	    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	    try {
	        Date fechaSalida = formatoFecha.parse(salida);	        
	        Date fechaLlegada = new Date(fechaSalida.getTime() + duracion);
	        return formatoFecha.format(fechaLlegada);
	    } catch (ParseException e) {
	        System.out.println("Error al analizar la fecha de llegada: " + e.getMessage());
	        return "";
	    }
	}
}