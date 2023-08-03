package ejercicio2b;



import java.time.format.DateTimeFormatter;


public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Hay que crear una aplicación para mostrar a los usuarios los vuelos disponibles de un aeropuerto nacional.
Un vuelo tiene un identificador, fecha y hora de salida, duración aproximada del vuelo, ciudad de destino.
El panel de información de vuelos debe mostrar
		 * 
		 * 
		 * 
		 */
		
	     
		    Vuelo vuelo1 = new Vuelo(1, "17/04/2023 15:45", "17/04/2023 16:30", "Madrid");
	        Vuelo vuelo2 = new Vuelo(2, "18/04/2023 10:15", "18/04/2023 12:50", "Barcelona");
	        Vuelo vuelo3 = new Vuelo(3, "18/04/2023 14:00", "18/04/2023 15:45", "Vigo");
	        Vuelo vuelo4 = new Vuelo(4, "20/05/2023 16:00" , "20/05/2023 17:00" , "Galicia");

	        PanelVuelo panel = new PanelVuelo();
	        panel.agregarVuelo(vuelo1);
	        panel.agregarVuelo(vuelo2);
	        panel.agregarVuelo(vuelo3);
	        panel.agregarVuelo(vuelo4);

	        panel.mostrarVuelos();
	        
	        
      
	      
	}
	       
	}
      
  

		
		
		
		
	
	
		

		
	
	
	
	

