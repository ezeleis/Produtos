import Entidades.Produtos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String nome = sc.nextLine();

        System.out.println("Enter the product price: ");
        Double preco = sc.nextDouble();

        System.out.println("Enter the product quantity: ");
        Integer quantidade = sc.nextInt();

        Produtos.Produto produto = new Produtos.Produto(nome, preco, quantidade);
    }
}
