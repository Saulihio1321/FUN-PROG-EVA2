/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_5_operaciones;

/**
 *
 * @author invitado
 */
public class EVA_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1, var2, resu;
        
        var1= 100;
        var2= 200;        
        //OPERADORES
        //SUMA
        //CONCATENAR -- UNIR CADENAS DE TEXTO
        resu= var1 + var2;
        System.out.println("suma");
        System.out.println("var1=" + var1);
        System.out.println("var2=" + var2);
        System.out.println("var1 + var2= " + resu);
        //RESTA
        resu = var1 - var2;
        System.out.println();
        System.out.println("RESTA");
        System.out.println("var1=" + var1);
        System.out.println("var2 =" + var2);
        System.out.println("var1 - var 2 =" + resu);
        //MUTIPLICACION
        System.out.println();
        System.out.println("multiplicacion");
        System.out.println("var1=" + var1);
        System.out.println("var2 =" + var2);
        System.out.println("var1 x var2=" + resu);
        //division
        var1 = 15;
        var2 = 0x7;
                
        System.out.println();
        System.out.println("division");
        System.out.println("var1 =" + var1);
        System.out.println("var2 =" + var2);
        System.out.println("var2 / var1 =" + resu);
        
        double resuExacto;
        resuExacto = var1 / var2;
        System.out.println();
        System.out.println("division");
        System.out.println("var1 =" + var1);
        System.out.println("var2 =" + var2);
        System.out.println("var2 / var1 =" + resuExacto);
        
        double var2F = 7;
         resuExacto = var1 / var2F;
          System.out.println();
        System.out.println("division");
        System.out.println("var1 =" + var1);
        System.out.println("var2 =" + var2F);
        System.out.println("var2 / var1 =" + resuExacto);
        
        int cifra = 7;
        double cifraDouble = 7.0;
        
        double division = 100 / 10; //SE TOMA EL DIVISOR COMO ENTERO
        
        //PRECEDENCIA DE OPERACIONES:
        int a = 5, b = 3, c = 2;
        int resultado = (a * b) + (a - c) * (b - a); //(15)+(3)*(-2) // 15-6=9
        System.out.println("RESUKTADO PRECEDENCIA" + resultado);
    }
    
}
