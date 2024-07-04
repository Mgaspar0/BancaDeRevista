package banca;

import java.util.Scanner;


public class Principal {

	
	    public static void main(String[] args) {
	        BancaDeRevista banca = new BancaDeRevista();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Adicionar Revista");
	            System.out.println("2. Listar Revistas");
	            System.out.println("3. Buscar Revista por Título");
	            System.out.println("4. Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o título da revista: ");
	                    String titulo = scanner.nextLine();
	                    System.out.print("Digite a editora da revista: ");
	                    String editora = scanner.nextLine();
	                    System.out.print("Digite o preço da revista: ");
	                    double preco = scanner.nextDouble();
	                    scanner.nextLine(); 

	                    Revista revista = new Revista(titulo, editora, preco);
	                    banca.adicionarRevista(revista);
	                    break;
	                case 2:
	                    banca.listarRevistas();
	                    break;
	                case 3:
	                    System.out.print("Digite o título da revista que deseja buscar: ");
	                    String tituloBusca = scanner.nextLine();
	                    Revista revistaEncontrada = banca.buscarRevistaPorTitulo(tituloBusca);
	                    if (revistaEncontrada != null) {
	                        System.out.println("Revista encontrada: " + revistaEncontrada);
	                    } else {
	                        System.out.println("Revista não encontrada.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Saindo...");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	       }
	    }
	 }
}
	
