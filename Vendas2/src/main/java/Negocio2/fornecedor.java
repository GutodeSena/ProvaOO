package Negocio2;

import java.util.Objects;

public class fornecedor {
    private int id;
    private String nome;
    private String cnpj;
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "fornecedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        fornecedor that = (fornecedor) o;
        return id == that.id && Objects.equals(nome, that.nome) && Objects.equals(cnpj, that.cnpj) && Objects.equals(telefone, that.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cnpj, telefone);
    }
    public static void main(String[] args){
        fornecedor nome = "entregas";
        fornecedor id = 56;
        fornecedor string = "Fernando";
        fornecedor telefone = "93986-9999";

    }
}
