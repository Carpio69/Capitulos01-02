/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Interfaces.Criterios;
import Libro.Cap02.Interfaces.Alumno;
/**
 *
 * @author cybertron
 */
public class TestCriterio 
{
        public static void main(String[] args)
    {
        Alumno arr[] = { new Alumno("Martin", 25, 7.2)
        ,new Alumno("Carlos", 23, 5.1)
        ,new Alumno("Anastasio", 20, 4.8) };
        Util.ordenar(arr,new CriterioAlumNombre());
        Util.imprimir(arr);
        Util.ordenar(arr,new CriterioAlumNotaProm());
        Util.imprimir(arr);
    }
}
