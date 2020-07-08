package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Produto implements Serializable {

    private Integer id;
    private Integer quantidade;

    private String nome;
    private String material;

    private Double valor;

    private Tipo tipo;

    public Produto()    {

    }

    public Produto(Integer id, String nome, String material, Integer quantidade, Double valor, Tipo tipo) {
        this.id = id;
        this.nome = nome;
        this.material = material;
        this.quantidade = quantidade;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", material='" + material + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                ", tipo=" + tipo +
                '}';
    }
}
