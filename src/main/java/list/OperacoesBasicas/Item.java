package main.java.list.OperacoesBasicas;

public class Item {
    private String nome;
    private Double preco;
    private int quant;


    public Item(String nome, Double preco, int quant){
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }


    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }


    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quant=" + quant +
                '}';
    }
}
