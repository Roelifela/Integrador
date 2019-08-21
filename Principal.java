package br.com.digitalhouse;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


class Principal {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();
        Livro harryPotter = new Livro(1, "Harry Potter e a Pedra Filosofal", "J.K Rowling", "1997", "1234", 10, 20.50);
        Livro harryPotter2 = new Livro(2, "Harry Potter e a Câmara Secreta", "J.K Rowling", "1997", "12345", 10, 21.50);
        Livro harryPotter3 = new Livro(3, "Harry Potter e o Prisioreiro de Askaban", "J.K Rowling", "1997", "1234", 10, 23.50);

        List<Livro> livrosHarry = new ArrayList<>();
        livrosHarry.add(harryPotter);
        livrosHarry.add(harryPotter2);
        livrosHarry.add(harryPotter3);

        livraria.cadastrarLivro(harryPotter);
        livraria.cadastrarLivro(harryPotter2);
        livraria.cadastrarLivro(harryPotter3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("  --  DIGITE UMA DAS OPÇÕES  --  ");
        System.out.println("-  CADASTRO DE LIVROS -> 1");
        System.out.println("-  CONSULTA DE LIVROS -> 2");
        System.out.println("-  VENDA DE LIVROS    -> 3");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("DIGITE O CODIGO DO LIVRO...:");
            int codigo = scanner.nextInt();
            System.out.println("DIGITE O TITULO DO LIVRO...:");
            String titulo = scanner.next();
            System.out.println("DIGITE O AUTOR DO LIVRO....:");
            String autor = scanner.next();
            System.out.println("DIGITE O ANO DE LANCAMENTO.:");
            String anoLancamento = scanner.next();
            System.out.println("DIGITE O CODIGO ISBN LIVRO.:");
            String codigoISBN = scanner.next();
            System.out.println("DIGITE O QTDE DO LIVRO.....:");
            int quantidadeEstoque = scanner.nextInt();
            System.out.println("DIGITE O PREÇO DO LIVRO....:");
            double preco = scanner.nextDouble();

            Livro novoLivro = new Livro(codigo, titulo, autor, anoLancamento, codigoISBN, quantidadeEstoque, preco);
            List<Livro> novoCadastro = new ArrayList<>();
            livraria.cadastrarLivro(novoLivro);


            System.out.println("NOVO LIVRO CADASTRADO COM SUCESSO!!!");
            System.out.println("DIGITE UMA OPÇÃO...:");

            opcao = scanner.nextInt();

        }

        if (opcao == 2) {
            System.out.println("CODIGO A SER CONSULTADO..:");
            int codigo = scanner.nextInt();
            livraria.consultarLivroPorCodigo(codigo);
            System.out.println("DIGITE UMA OPÇÃO...:");
            opcao = scanner.nextInt();
        }

        if (opcao == 3){
            System.out.println("INFORME O CODIGO DO LIVRO.:");
            int codigo = scanner.nextInt();
            livraria.efetuarVenda(codigo);
            System.out.println(livrosHarry);
            System.out.println("DIGITE UMA OPÇÃO...:");
            opcao = scanner.nextInt();

        }

    }
}