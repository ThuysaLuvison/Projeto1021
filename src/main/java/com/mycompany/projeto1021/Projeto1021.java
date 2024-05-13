/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1021;
import java.util.Scanner;
public class Projeto1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double valor = sc.nextDouble();
         int centavos = (int) (valor * 100);
        
        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        for (int nota : notas) {
        int quantidadeNotas = centavos / nota;
        System.out.println("NOTAS:\n" + quantidadeNotas + " nota(s) de R$ " + (nota / 100) + ".00");
        centavos %= nota;
        }
        
        int[] moedas = {100, 50, 25, 10, 5, 1};
        for (int moeda : moedas) {
            int quantidadeMoedas = centavos / moeda;
            System.out.println("MOEDAS:\n" + quantidadeMoedas + " moeda(s) de R$ " + (moeda / 100.0));
            centavos %= moeda;
        }
    }
}

