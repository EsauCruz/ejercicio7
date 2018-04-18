
package ejercicio7;

import java.util.Scanner;

/*
Nombre de la clase: calculoIva
Fecha:7-3-2018
Versión:1
CopyRight©:ITCA-SIS12A
@author Josué Esaú Cruz Mejía
*/

/*
7-Leer el valor de la compra de usuario y aplicarle el 13% de IVA.
*/
public class Ejercicio7 
{
    public static void main(String[] args) 
    {
    double compra;
    double impuesto;
    double total;
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese el valor de la compra");
    compra=leer.nextDouble();
    
    impuesto=compra*0.13;
    
    total=compra+impuesto;
    
    System.out.println("Valor de la compra: "+compra);
    System.out.println("Valor del IVA: "+impuesto);
    System.out.println("Total a pagar: "+total);
    }
}
