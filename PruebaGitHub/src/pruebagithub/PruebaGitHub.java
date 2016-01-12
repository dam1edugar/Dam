/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithub;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class PruebaGitHub {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        double PRECIO;  
        double DESCUENTO;
        double PRECIO2;
        
        System.out.println("Introduce el precio de un producto");
        PRECIO = in.nextInt();
        System.out.println("Introduce el descuento del producto");
        DESCUENTO = in.nextInt();
        
        PRECIO2=PRECIO*(1-(DESCUENTO/100));
        
        if(PRECIO2<=100)
        System.out.println("Su compra se reduce a " + PRECIO2);
        else
            System.out.println("Su compra se reduce a " + (PRECIO2-15));
            
    }
    
}
