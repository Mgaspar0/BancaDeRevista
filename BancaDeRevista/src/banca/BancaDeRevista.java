package banca;

import java.util.ArrayList;
import java.util.List;

public class BancaDeRevista {

	
	
	    private List<Revista> revistas;

	    public BancaDeRevista() {
	        this.revistas = new ArrayList<>();
	    }

	    public void adicionarRevista(Revista revista) {
	        revistas.add(revista);
	        System.out.println("Revista adicionada: " + revista);
	    }

	    public void listarRevistas() {
	        if (revistas.isEmpty()) {
	            System.out.println("Nenhuma revista disponível.");
	        } else {
	            System.out.println("Revistas disponíveis:");
	            for (Revista revista : revistas) {
	                System.out.println(revista);
	            }
	        }
	    }

	    public Revista buscarRevistaPorTitulo(String titulo) {
	        for (Revista revista : revistas) {
	            if (revista.getTitulo().equalsIgnoreCase(titulo)) {
	                return revista;
	            }
	        }
	        return null;
	    }
	}


