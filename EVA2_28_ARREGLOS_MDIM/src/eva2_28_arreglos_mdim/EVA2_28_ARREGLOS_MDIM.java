/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_28_arreglos_mdim;

/**
 *
 * @author invitado
 */
public class EVA2_28_ARREGLOS_MDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLOS DE 2 DIMENCIONES
        int [][] matriz = new int [5][10];
        
        // ASIGNAR UN VALOR
        matriz[1][3] = 100;
        System.out.println("valor de [1][4] = " + matriz[1][3]);
        System.out.println("matriz.length = " + matriz.length);
        
        //matriz.length siempre es de primera dimension
        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                matriz[i][j] = (int)(Math.random() * 100);
                
            }
            
        }
        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                System.out.print("[" + matriz[i][j] + "]");                
            }
            System.out.println("");
            
        }
    }
    
}
