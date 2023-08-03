package ejercicio2Archivos;

import java.io.Serializable;

public class Rio implements Serializable {

	private int id;
	private String nombre;
	private double longitud;
	private String lugarNacimiento;

	public Rio(int id, String nombre, double longitud, String lugarNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.longitud = longitud;
		this.lugarNacimiento = lugarNacimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		final Rio other = (Rio) obj;
		return this.id == other.id;
	}

	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + this.id;
		return hash;
	}
}