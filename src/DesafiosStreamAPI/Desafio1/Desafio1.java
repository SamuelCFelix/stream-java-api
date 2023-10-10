package DesafiosStreamAPI.Desafio1;

import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //Desafio 1 - Mostre a lista na ordem numérica:
    //Crie um programa que utilize a Stream API para ordenar a lista de números
    // em ordem crescente e a exiba no console.
    public void organizarEmOrdemCrescente(){
        if (numeros.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        } else {
            numeros.stream().sorted()
                    .forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        Desafio1 desafio = new Desafio1();
        desafio.organizarEmOrdemCrescente();
    }
}
