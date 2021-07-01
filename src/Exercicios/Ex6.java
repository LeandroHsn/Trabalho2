package Exercicios;

import Classes.Fila;
public class Ex6 {
    public static void main(String[] args) {

        System.out.println("Exercício 6");

        Fila<Object> fila = new Fila<Object>(7);
        
        fila.enfileirar(1);
        fila.enfileirar(23);
        fila.enfileirar(31);
        fila.enfileirar(44);
        fila.enfileirar(58);
        fila.enfileirar(66);

        System.out.println("Fila impressa normal: " + fila.toString());
        fila.inverterFila();
        System.out.println("Fila invertida: " + fila.toString());
    }
}
