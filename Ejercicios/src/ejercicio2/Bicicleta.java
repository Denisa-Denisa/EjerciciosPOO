package ejercicio2;


public abstract class Bicicleta {

	
	private static final double PRECIO_BASE_POR_DEFECTO = 100;
	private static final String[] COLORES_DISPONIBLES = {"rojo" , "negro" , "blanco", "azul"};
	
	protected double precioBase;
	protected String color;
	protected int tamanoRuedas; 
	protected int numVelocidades;
	protected int numPlatos; 
	

	
	public Bicicleta() {
		super();
		precioBase = PRECIO_BASE_POR_DEFECTO;
	}


	    public Bicicleta(String color, int tamanoRuedas) {
	        this.color = color;
	        this.tamanoRuedas = tamanoRuedas;
	        this.precioBase = 100;
	    }

	    public String getColor() {
	        return color;
	    }

	    public int getTamanoRuedas() {
	        return tamanoRuedas;
	    }

	    public double getPrecio() {
	        return precioBase;
	    }
	    
	    
	    protected boolean comprobarColor(String color) {
			boolean ok = false;
			for(String c : COLORES_DISPONIBLES) {
				if (c.equals(color.toLowerCase())) {
					ok = true;
				}
			}
			return ok;
		}
	    
	   
	}
	

	

