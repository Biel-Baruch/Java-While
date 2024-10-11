/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvwhile2;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtvWhile2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();
        
        int contador = 1;

        while (contador <= N) {
            System.out.println(contador);
            contador++;
        }

    }
}
