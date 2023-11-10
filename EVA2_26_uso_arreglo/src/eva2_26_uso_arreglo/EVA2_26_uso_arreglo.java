/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_26_uso_arreglo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_uso_arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] platillos = new String[10];
        platillos[0] = "tacos al pastor";
        platillos[1] = "kilo de tamales";
        platillos[2] = "torta de lomo";
        platillos[3] = "tripitas";
        platillos[4] = "chilaquiles";
        platillos[5] = "hamburguesas";
        platillos[6] = "enchiladas";
        platillos[7] = "papas francesas";
        platillos[8] = "burrito de lomo";
        platillos[9] = "burrito de papa";
        double[] precio ={40, 90, 45, 35, 50, 40, 30, 35, 40, 40};
        
        System.out.println("------menu-------");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i + "-" + platillos[i] + ": $" + precio[i]);
        }
        int opc, cant;
        Scanner input = new Scanner(System.in);
        System.out.println("que quieres ordenar?");
        opc = input.nextInt();
        System.out.println("cuantas ordenes quiere?");
        opc = input.nextInt();
        System.out.println("el costo el pedido es: $" + (cant * precio[opc]));
    }
    
}
