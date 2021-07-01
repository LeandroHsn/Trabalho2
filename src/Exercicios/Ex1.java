package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Classes.Produto;

public class Ex1 {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto(1, "Parachoque", 1020, 5);
        Produto produto2 = new Produto(2, "Parabriza", 4120, 11);
        Produto produto3 = new Produto(3, "Lanterna Porche", 820, 9);
        Produto produto4 = new Produto(4, "Bateria", 120, 2);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        System.out.println("O menor valor é: " + menorPreco(produtos));
    }

    public static Float menorPreco(List<Produto> list) {        
        Float valor;
        Float menorValor;
        List<Float> valorMenor = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            valor = list.get(i).getPreco();
            valorMenor.add(valor);
        }
        menorValor = Collections.min(valorMenor);
        return menorValor;
    }

}
