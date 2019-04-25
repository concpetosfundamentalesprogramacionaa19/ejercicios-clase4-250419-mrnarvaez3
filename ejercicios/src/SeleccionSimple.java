
import java.util.Scanner;
import paquetedos.Operacion;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class SeleccionSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String miMensaje = Operacion.mensaje;
        Scanner entrada = new Scanner(System.in);
        // documentacion
        int calificacion;
        System.out.println("Por favor ingrese su calificacion: ");
        calificacion = entrada.nextInt();
                
        
        if (calificacion >= 85){
            System.out.printf("%s%d\n",miMensaje, calificacion);
        }
        
        int calificacion_2;
        System.out.println("Por favor ingrese su calificacion: ");
        calificacion_2 = entrada.nextInt();
        
        if (calificacion_2 >= 84){
            System.out.printf("%s%d\n", miMensaje, calificacion_2);
        }
    }
    
}
