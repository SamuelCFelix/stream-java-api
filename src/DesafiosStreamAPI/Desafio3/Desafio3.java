package DesafiosStreamAPI.Desafio3;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    //Desafio 3 - Verifique se todos os números da lista são positivos:
    //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void verificarSeTodosOsNumerosSaoPositivos() {
        if (numeros.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        } else {
            boolean todosPositivos = numeros.stream().allMatch(numero -> numero >= 0);
            if (todosPositivos) {
                System.out.println("Todos os números são positivos.");
            } else {
                System.out.println("Pelo menos um número não é positivo.");
            }
        }
    }

    public static void main(String[] args) {
        Desafio3 desafio = new Desafio3();
        desafio.verificarSeTodosOsNumerosSaoPositivos();
    }
}