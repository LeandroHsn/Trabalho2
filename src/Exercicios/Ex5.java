package Exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import Classes.Produto;

public class Ex5 {
    public static void main(String[] args) {
        
        Queue<Produto> filaComPrioridade = new PriorityQueue<Produto>(new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return Float.valueOf(p2.getPreco()).compareTo(p1.getPreco());
            }

        });

        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto(1, "Parachoque", 1020, 5);
        Produto produto2 = new Produto(2, "Parabriza", 4120, 11);
        Produto produto3 = new Produto(3, "Lanterna Porche", 820, 9);
        Produto produto4 = new Produto(4, "Bateria", 120, 2);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        for (int i = 0; i < produtos.size() ; i++) {            
            filaComPrioridade.offer(produtos.get(i));
        }

        System.out.println("Fila sem prioridade: ");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }

        System.out.println("Fila com prioridade no preço: ");
        while (!filaComPrioridade.isEmpty()) {
            System.out.println(filaComPrioridade.poll());
        }
    }
    
}
