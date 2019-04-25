/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Principal {
    public static void main (String[] args){
     Scanner entrada = new Scanner(System.in);
   //  declaracion de variables
      int mensaje;
      double precio;
      double preciofinal;
      // ingreso de datos
        System.out.println("por favor ingrese el numero de mensajes: ");
        mensaje = entrada.nextInt();
        //  condicionales de tarifas
        
        if (mensaje <= 40){ //  tarifa base
            precio = 3;
            preciofinal = 3 + (precio*0.12);
            System.out.printf("El valor final mensual a pagar"
                    + " es de: %.2f$\n", preciofinal);     
        } else {
            if(mensaje > 40 && mensaje < 200){ //  tarifa mas de 40 mensajes
                precio = (3 + ((mensaje-40)*0.05));
                preciofinal = (precio + (precio*0.12));
                System.out.printf("El valor final mensual a pagar"
                        + " es de: %.2f$\n", preciofinal);
                        
            } else 
            {if (mensaje > 200){ // tarifa mas de 200 mensajes
                precio = 3 + ((mensaje-200)*0.1);
                preciofinal = precio + (precio*0.12);
                System.out.printf("El valor final mensual a pagar"
                        + " es de: %.2f$\n", preciofinal);
            }
        }
        
  }
}
