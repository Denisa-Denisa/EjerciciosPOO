package ejercicio3b;

public class Revistas extends Publicacion {

	public Revistas(int codigo, String titulo, int anioPublicacion) {
		super(codigo, titulo, anioPublicacion);

	}

	private int numero;

	public int getNumero() {
		return numero;
	}

	public String toString() {
		return "Revista:  {" + "codigo: " + getCodigo() + ", titulo: '" + getTitulo() + '\'' + ", anioPublicacion: "
				+ getAnioPublicacion() + ", numero: " + numero + '}';
	}
}