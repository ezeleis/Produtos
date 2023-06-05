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
    }
}
