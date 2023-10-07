package Negocio2;

import java.util.Objects;

public class produto {
    private int id;
    private String nome;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private double desconto;
    private String fabricant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void tela(){
        System.out.printf()

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    [code]public Construtor(){
    }

    @Override
    public String toString() {
        return "produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precoCompra=" + precoCompra +
                ", precoVenda=" + precoVenda +
                ", desconto=" + desconto +
                ", fabricant='" + fabricant + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        produto produto = (produto) o;
        return id == produto.id && Double.compare(produto.precoCompra, precoCompra) == 0 && Double.compare(produto.precoVenda, precoVenda) == 0 && Double.compare(produto.desconto, desconto) == 0 && Objects.equals(nome, produto.nome) && Objects.equals(descricao, produto.descricao) && Objects.equals(fabricant, produto.fabricant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, precoCompra, precoVenda, desconto, fabricant);
    }
    public static void main(String[] args){
        produto id = 96;
        produto nome "chocolate";
        produto descricao = "gostoso";
        produto precoCompra = 150.00;
        produto precoVenda = 290;
        produto desconto = 20;
        produto fabricant = "Wonkabars";


    }
}
