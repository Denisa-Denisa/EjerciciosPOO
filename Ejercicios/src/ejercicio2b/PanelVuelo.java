package ejercicio2b;

import java.util.ArrayList;

public class PanelVuelo {

	 private ArrayList<Vuelo> vuelos;

	    public PanelVuelo() {
	        vuelos = new ArrayList<>();
	    }

	    public void agregarVuelo(Vuelo vuelo) {
	        vuelos.add(vuelo);
	    }

	    public void mostrarVuelos() {
	        System.out.println("ID\tSALIDA\t\t\tLLEGADA\t\t\tDESTINO\t\tDURACION");
	        for (Vuelo vuelo : vuelos) {
	            System.out.println(vuelo.getId() + "\t" + vuelo.getSalida() + "\t" + vuelo.getLlegada() + "\t" + vuelo.getDestino() + "\t" + "\t" + vuelo.getDuracion() + " minutos");
	        }
	    }
	}

