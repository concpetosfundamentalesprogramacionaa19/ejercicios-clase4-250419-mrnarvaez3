
import java.util.Scanner;
import paquetedos.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
// Por Roberto Narvaez
public class SeleccionAnidada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String miMensaje = OperacionDos.mensaje;
        String miMensaje2 = OperacionDos.mensaje2;
        Scanner entrada = new Scanner(System.in);
        // documentacion
        int calificacion;
        System.out.println("Por favor ingrese su calificacion: ");
        calificacion = entrada.nextInt();
                
        //  salida de datos
        if (calificacion >= 90){
            System.out.printf("%s(excelente) con %d\n", miMensaje, calificacion);
        } else {
            if (calificacion <90 && calificacion >= 80){
               System.out.printf("%s(muy buena) con %d\n", miMensaje, calificacion);  
            } else {
                if (calificacion <80 && calificacion >=50){
                     System.out.printf("%s(regular) con %d\n",miMensaje, calificacion);
                } else {
                if (calificacion <50 ) {
                     System.out.printf("%s con %d\n",miMensaje2, calificacion);
                }   
               }
            }
        }
        
    }
}
    

