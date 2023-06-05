package Entidades;

public class Produtos {
    public static class Produto{
        String nome;
        Double preco;
        Integer quantidade;

        Produto(String nome, Double preco, Integer quantidade){
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco  =preco;
        }
    }
}
