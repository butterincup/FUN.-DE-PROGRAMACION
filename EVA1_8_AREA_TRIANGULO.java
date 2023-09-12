/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // double es para numeros reales
        double b;
        double h;
        double A;
        Scanner cap =new Scanner(System.in);
        System.out.println("introduce la base del triangulo");
        b = cap.nextDouble();
        System.out.println("introduce la altura del triangulo");
        h = cap.nextDouble();
        A=(b*h) / 2;
        System.out.println("El area es");
        System.out.println(A);
    }
}
