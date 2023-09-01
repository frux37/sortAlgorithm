/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sort;

/**
 *
 * @author 20212pf.cc0012
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        int escolha = scanner.nextInt();

        Sort sorter = new Sort(array);

        switch (escolha) {
            case 1:
                sorter.bubbleSort();
                break;
            case 2:
                sorter.selectionSort();
                break;
            case 3:
                sorter.insertionSort();
                break;
            case 4:
                sorter.mergeSort(0, array.length - 1);
                break;
            case 5:
                sorter.quickSort(0, array.length - 1);
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("Array ordenado:");
        sorter.printArray();

        scanner.close();
    }
}
