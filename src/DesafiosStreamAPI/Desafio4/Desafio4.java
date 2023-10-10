package DesafiosStreamAPI.Desafio4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {
    //Desafio 4 - Remova todos os valores ímpares:
    //Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void removerValoresImpares() {
        if (numeros.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        } else {
            List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
            System.out.println("Lista de números pares:");
            System.out.println(numerosPares);
        }
    }

    public static void main(String[] args) {
        Desafio4 desafio = new Desafio4();
        desafio.removerValoresImpares();
    }
}
