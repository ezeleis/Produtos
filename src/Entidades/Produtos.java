package Entidades;

public class Produtos {
    public static class Produto{
        public String nome;
        public Double preco;
        public Integer quantidade;

        public Produto(String nome, Double preco, Integer quantidade){
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco  =preco;
        }
        @Override
        public String toString() {
            double total = preco * quantidade;
            return nome + ", " + preco + " R$, " + quantidade + " unidades, Total: " + total + " R$";
        }
    }
}
