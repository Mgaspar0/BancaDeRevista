package banca;

public class Revista {


	    private String titulo;
	    private String editora;
	    private double preco;

	    public Revista(String titulo, String editora, double preco) {
	        this.titulo = titulo;
	        this.editora = editora;
	        this.preco = preco;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getEditora() {
	        return editora;
	    }

	    public void setEditora(String editora) {
	        this.editora = editora;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    @Override
	    public String toString() {
	        return "Revista [Título=" + titulo + ", Editora=" + editora + ", Preço=" + preco + "]";
	    }
	}

	
