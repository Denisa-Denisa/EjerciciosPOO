package ejercicio3;

public class Libro {

	
	  private String ISBN;
	    private String titulo;
	    private String editorial;
	    private String autor;

	    public Libro(String ISBN, String titulo, String editorial, String autor) {
	        this.ISBN = ISBN;
	        this.titulo = titulo;
	        this.editorial = editorial;
	        this.autor = autor;
	    }

	    public String getISBN() {
	        return ISBN;
	    }

	    public void setISBN(String ISBN) {
	        this.ISBN = ISBN;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getEditorial() {
	        return editorial;
	    }

	    public void setEditorial(String editorial) {
	        this.editorial = editorial;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }
	
}
