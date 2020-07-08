package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Tipo implements Serializable {

    private Integer id;
    private String nome;

    public Tipo() {

    }

    public Tipo(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tipo)) return false;
        Tipo tipo = (Tipo) o;
        return Objects.equals(id, tipo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "tipo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
