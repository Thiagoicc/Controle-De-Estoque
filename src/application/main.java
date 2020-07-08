package application;

import model.entities.Produto;
import model.entities.Tipo;

public class main {
    public static void main(String[] args) {
        Tipo tipo = new Tipo(1, "Guardanapo");
        Produto produto = new Produto(1, "Amarelo Claro", "Linho", 200, 10.80, tipo);
        System.out.println(tipo);
        System.out.println(produto);
    }
}
    