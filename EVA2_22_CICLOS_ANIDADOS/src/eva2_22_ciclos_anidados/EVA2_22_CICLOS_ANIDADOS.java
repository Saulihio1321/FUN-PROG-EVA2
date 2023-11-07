/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_22_CICLOS_ANIDADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce un numero");
        nume = input.nextInt();
        for (int j = nume; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
