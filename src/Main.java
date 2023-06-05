import Entidades.Produtos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produtos.Produto> inventory = new ArrayList<>();

        System.out.println("Digite o número de produtos a serem adicionados no estoque: ");
        int numProducts = sc.nextInt();

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Digite o nome do produto: ");
            String name = sc.next();

            System.out.println("Digite o preço do produto: ");
            double price = sc.nextDouble();

            System.out.println("Digite a quantidade do produto: ");
            int quantity = sc.nextInt();

            Produtos.Produto product = new Produtos.Produto(name, price, quantity);
            inventory.add(product);
        }

        System.out.println("Estoque atual: ");
        displayInventory(inventory);

        System.out.println("Digite o número do produto a ser removido ou '-1' para cancelar: ");
        int removeIndex = sc.nextInt();

        if (removeIndex >= 0 && removeIndex < inventory.size()) {
            inventory.remove(removeIndex);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Índice inválido! Nenhum produto removido.");
        }

        System.out.println("Estoque atualizado: ");
        displayInventory(inventory);

        double totalStockValue = calculateTotalStockValue(inventory);
        System.out.println("Valor total do estoque: R$" + totalStockValue);
    }

    public static void displayInventory(List<Produtos.Produto> inventory) {
        for (int i = 0; i < inventory.size(); i++) {
            Produtos.Produto product = inventory.get(i);
            System.out.println("Índice: " + i);
            System.out.println("Nome: " + product.nome);
            System.out.println("Preço: " + product.preco);
            System.out.println("Quantidade: " + product.quantidade);
            System.out.println("-----------------------");
        }
    }

    public static double calculateTotalStockValue(List<Produtos.Produto> inventory) {
        double totalValue = 0.0;
        for (Produtos.Produto product : inventory) {
            totalValue += product.preco * product.quantidade;
        }
        return totalValue;
    }
}
