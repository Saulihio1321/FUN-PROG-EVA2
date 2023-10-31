/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_for2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_FOR2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //VAMOS A CAPTURAR CALIFICACION DE UN GRUPO Y GENERAR
        //EL PROMEDIO:
        int noCalifa;
        int sumaCalifas = 0; //cero es el neutro aditivo
                             //1 es el neutro multiplicativo
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de calificaciones");
        noCalifa = input.nextInt();
        for(int i = 0; i < noCalifa; i++){
            System.out.println("Introduce la calificacion: ");
            int califa = input.nextInt();
            //sumatoria de calificaciones:
            //ACUMULADORES
            //sumaCalifas = sumaCalifas + califa;
            sumaCalifas += califa;
        }
        //el promedio noCalifa/sumaCalifa,pero ambos son enteros
        // y dividir entros da entero sin decimal
        double promedio = sumaCalifas / (noCalifa * 1.0); 
        System.out.println("el promedio es" + promedio);
    }       
}
