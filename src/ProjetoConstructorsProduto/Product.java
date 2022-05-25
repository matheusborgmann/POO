package ProjetoConstructorsProduto;

public class Product {

    public String nome;
    public double preco;
    public int quantidade;

    public Product() {

    }

    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double totalEstoque() {
        return preco * quantidade;
    }

    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome
                + ", $"
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidade, total: $"
                + String.format("%.2f", totalEstoque())
                ;
    }
}
