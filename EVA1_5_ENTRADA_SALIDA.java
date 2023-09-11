/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. declaracion de variables
        String nombre;
        String apellidos;
        int semestre;
        Scanner capturota = new Scanner(System.in);
        //; fin de instruccion en java
        //2. Captura de variables
        System.out.println("Introduse tu nombre");
        nombre = capturota.nextLine();
        System.out.println("introduse tu apellido");
        apellidos = capturota.nextLine();
        System.out.println("introduse tu semestre");
        semestre = capturota.nextInt();
        // Java es sensible a mayusculas y minusculas
        // es decir: es diferente System y sistem
        //3. mostrar los datos capturados
        System.out.println("nombre");
        System.out.println("apellidos");
        System.out.println("semestre");
    }
   
    
}
