package ejercicio3b;

public abstract class Publicacion {

	private int codigo;
	private String titulo;
	private int anioPublicacion;

	public Publicacion(int codigo, String titulo, int anioPublicacion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public String toString() {
		return "Publicacion:  { " + "codigo:" + codigo + ", titulo: '" + titulo + '\'' + ", añoPublicacion: "
				+ anioPublicacion + '}';
	}
}
