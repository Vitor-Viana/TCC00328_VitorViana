package fatorial;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        
        int f = 1, c = num;
        String sequencia = "";
        while (c >= 1) {
            if (c != 1) {
                sequencia += c + " x ";
            } else {
                sequencia += c + " =";
            }
            f *= c;
            c--;
        }
        System.out.printf("Fatorial de %d! = %s %d \n", num, sequencia, f);
    }
}
