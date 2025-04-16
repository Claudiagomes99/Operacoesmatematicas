 /* Claudia Vieira Gomes - calculadora
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadorasdeareas;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class OperacoesMatematica {
    public static void main(String[] args){ 
        //Definição de dois números
        double num1 = 10.5;
        double num2 = 5.2;
        
        // realizando operações matemática
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2: Double.NaN; // Evita divisão
        double resto = num1 % num2;
        //Exibindo os resultado
        System.out.println("Resultados das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao : 
                "Indefinida (divisão por zero)"));
        System.out.println("Resto da Divisão" + resto);
    }
    
} 
