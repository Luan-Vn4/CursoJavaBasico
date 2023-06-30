/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorafatorialpoo;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class CalculadoraFatorialPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        Scanner leia = new Scanner(System.in);
        int r = 0;
        System.out.println("Digite o numero que deseja calcular o fatorial:");
        r = leia.nextInt();
        f.setValor(r);
        System.out.println("Resultado: " + f.getFatorial());
        System.out.println("Formula: " + f.getFormula());
    }
    
}
