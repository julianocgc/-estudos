package com.mycompany.javaapplicationsegundoprograma;

import javax.swing.JOptionPane;

public class JavaApplicationSegundoPrograma {

    public static void main(String[] args) {
        
        double numero1 = 6, numero2 = 4, resultado = numero1 + numero2;
        
        System.out.println("A soma é: " + resultado);
        
        JOptionPane.showMessageDialog(null, "A soma é " + resultado);
        
        resultado = numero1 * numero2;
        System.out.println("A multiplicação é " + resultado);
        
        System.out.println("A subtração é " + (numero1 - numero2));
        System .out.println("A divisão é " + numero1 / numero2);
        System.out.println("O resto da divisão é " + numero1 % numero2);
        System.out.println("3 elevado a 2 é igual a " + Math.pow(3, 2));
        
    }
}
