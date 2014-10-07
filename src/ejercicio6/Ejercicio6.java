/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float precio,pagado,total;
        
        System.out.println("Precio Original:");
        Scanner dato=new Scanner(System.in);
        precio=dato.nextFloat();
        System.out.println("Pagado:");
        pagado=dato.nextFloat();
        total=((precio-pagado)/precio)*100;
        System.out.println("Descuento= "+total+" %");
        
        
    }
    
}
