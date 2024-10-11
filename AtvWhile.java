/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvwhile;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtvWhile {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala? ");
        int numAlunos = scanner.nextInt();
        
        double somaNotas = 0;
        int contador = 0;

        while (contador < numAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
            
     
        double media = somaNotas / numAlunos;
        System.out.println("A média aritmética da turma é: " + media);
            
        }

    }
}

