import Entidades.Produtos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produtos.Produto> estoque = new ArrayList<>();

        System.out.println("Digite o número de produtos a serem adicionados no estoque: ");
        int numProdutos = sc.nextInt();

        for (int i = 0; i < numProdutos; i++) {
            System.out.println("Digite o nome do produto: ");
            String nome = sc.next();

            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            System.out.println("Digite a quantidade do produto: ");
            int quantidade = sc.nextInt();

            Produtos.Produto produto = new Produtos.Produto(nome, preco, quantidade);
            estoque.add(produto);
        }

        System.out.println("Estoque atual: ");
        for (Produtos.Produto produto : estoque) {
            System.out.println(produto.toString());
        }

        int opcao;
        do {
            System.out.println("Digite o número do produto a ser removido (ou -1 para sair): ");
            opcao = sc.nextInt();

            if (opcao >= 0 && opcao < estoque.size()) {
                estoque.remove(opcao);
                System.out.println("Produto removido com sucesso!");
            } else if (opcao != -1) {
                System.out.println("Índice inválido! Nenhum produto removido.");
            }
        } while (opcao != -1);

        System.out.println("Estoque atualizado: ");
        for (Produtos.Produto produto : estoque) {
            System.out.println(produto.toString());
        }

        double valorTotalEstoque = calcularValorTotalEstoque(estoque);
        System.out.println("Valor total do estoque: R$" + valorTotalEstoque);
    }

    public static double calcularValorTotalEstoque(List<Produtos.Produto> estoque) {
        double valorTotal = 0.0;
        for (Produtos.Produto produto : estoque) {
            valorTotal += produto.preco * produto.quantidade;
        }
        return valorTotal;
    }
}
