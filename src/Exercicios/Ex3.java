package Exercicios;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println("Exercício 3");

        ArrayList<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(7);
        listaInteiros.add(7);
        listaInteiros.add(15);
        listaInteiros.add(15);
        listaInteiros.add(3);
        listaInteiros.add(12);
        listaInteiros.add(5);
                
        System.out.println("Elementos completos: " + listaInteiros.toString());
        System.out.println("Elementos não repetidos: " + removerElementosRepetidos(listaInteiros));
    }

    public static Set<Integer> removerElementosRepetidos(ArrayList<Integer> listaInteiros){
        Set<Integer> listaNaoRepetida = new LinkedHashSet<>(listaInteiros);
        return listaNaoRepetida;
    }
}
