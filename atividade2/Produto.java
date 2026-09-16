// Produto.java
public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotal() {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500.00, 2);
        Produto produto2 = new Produto("Mouse", 80.00, 5);

        System.out.println("Valor total do " + produto1.nome + ": R$ " + produto1.valorTotal());
        System.out.println("Valor total do " + produto2.nome + ": R$ " + produto2.valorTotal());
    }
}
