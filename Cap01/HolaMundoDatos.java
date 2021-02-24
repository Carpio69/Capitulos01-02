/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;
import java.util.Scanner;

/**
 *
 * @author cybertron
 */
public class HolaMundoDatos 
{
 public static void main(String[] args)
   {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Ingresesu Nombre: ");
           String nom = scanner.next();
           System.out.print("Ingrese su Edad: ");
           int edad = scanner.nextInt();
           System.out.print("Ingrese su Altura: ");
           double altura = scanner.nextDouble();
           System.out.println("Nombre: "+nom + "\n" + "Edad: "+edad + "\n" +"Altura: "+altura);
   }   
}
