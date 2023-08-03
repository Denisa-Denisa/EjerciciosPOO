package ejercicio3b;

public class Libros extends Publicacion implements Prestable {

	private boolean prestado;

	public Libros(int codigo, String titulo, int anioPublicacion, boolean prestado) {
		super(codigo, titulo, anioPublicacion);
		this.prestado = prestado;
	}

	public void prestar() {
		if (!this.prestado) {
			this.prestado = true;
			System.out.println("El libro " + this.getTitulo() + " se ha prestado.");
		} else {
			System.out.println("El libro " + this.getTitulo() + " ya está prestado.");
		}
	}

	public void devolver() {
		if (this.prestado) {
			this.prestado = false;
			System.out.println("El libro " + this.getTitulo() + " se ha devuelto.");
		} else {
			System.out.println("El libro " + this.getTitulo() + " no estaba prestado.");
		}
	}

	public boolean prestado() {
		return this.prestado;
	}

	public String toString() {
		return "Libro:   {" + "codigo: " + getCodigo() + ", titulo: '" + getTitulo() + '\'' + ", anioPublicacion: "
				+ getAnioPublicacion() + ", prestado: " + prestado + '}';
	}
}
