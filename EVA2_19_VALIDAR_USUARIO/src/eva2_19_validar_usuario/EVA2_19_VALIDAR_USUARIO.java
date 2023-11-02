/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_validar_usuario;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_VALIDAR_USUARIO {
    final String NOMBRE_USUARIO = "ADMIN";
    final String PASSWORD = "ADMIN";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, password;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("introduce eñ usuario: ");
            usuario = input.nextLine();
            System.out.println("introduce contraseña");
            password = input.nextLine();
        }while(!password.equals(PASSWORD)  && !usuario.equals(NOMBRE_USUARIO));
        System.out.println("acceso concedido. BIENVENIDO");
        
                
        }
    }
    
}
