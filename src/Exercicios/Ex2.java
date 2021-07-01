package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("Exercício 2");

        ArrayList<Integer> listaInteiros = new ArrayList<>();
        
        listaInteiros.add(7);
        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(15);
        listaInteiros.add(3);
        listaInteiros.add(4);
        listaInteiros.add(5);
        listaInteiros.add(6);
        int xMaior = 3; // informa o tamanho de x

        System.out.println("Quantos números pares existem: " + valoresPares(listaInteiros));
        System.out.println("O maior valor: " + maiorValor(listaInteiros));
        System.out.println("O menor valor: " + menorValor(listaInteiros));
        System.out.println("A posição do maior valor: " + posicaoMaior(listaInteiros));
        System.out.println("A posição do menor valor: " + posicaoMenor(listaInteiros));
        System.out.println("A quantidade de números com valor maior do que x. sendo x um valor informado: "
                + valorMaior(listaInteiros, xMaior));
        System.out.println("A soma da lista: " + somaLista(listaInteiros));
    }

    // Funções/Métodos

    public static int valoresPares(List<Integer> list) {
        int qtdPares = 0;
        int valor = 0;
        for (int i = 0; i < list.size(); i++) {
            valor = list.get(i);
            if (valor % 2 == 0) {
                qtdPares++;
            }
        }
        return qtdPares;
    }

    public static int maiorValor(List<Integer> list) {
        int maiorValor = 0;
        maiorValor = Collections.max(list);
        return maiorValor;
    }

    public static int menorValor(List<Integer> list) {
        int menorValor = 0;
        menorValor = Collections.min(list);
        return menorValor;
    }

    public static int posicaoMaior(List<Integer> list) {
        int posicaoMaior = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == maiorValor(list)) {
                posicaoMaior = i;
            }
        }
        return posicaoMaior;
    }

    public static int posicaoMenor(List<Integer> list) {
        int posicaoMenor = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == menorValor(list)) {
                posicaoMenor = i;
            }
        }
        return posicaoMenor;
    }

    public static int valorMaior(List<Integer> list, int xMaior) {
        int valorMaior = 0;
        for (int i = 0; i < list.size(); i++) {
            if (xMaior < list.get(i)) {
                valorMaior++;
            }
        }
        return valorMaior;
    }

    public static int somaLista(List<Integer> list) {
        int valorSoma = 0;

        for (int i = 0; i < list.size(); i++) {
            valorSoma = valorSoma + list.get(i);
        }
        return valorSoma;
    }
}
