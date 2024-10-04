/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvjavafor3;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtvJavaFor3 {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();
            
            System.out.println("Tabela de quadrados:");
            for (int i = 1; i <= numero; i++) {
                System.out.println(i + "² = " + (i * i));
            }
        }
        
    }
}
