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
public class CriterioAlumNombre 
{
    public int comparar(Alumno a, Alumno b)
    {
        return a.getNombre().compareTo(b.getNombre());
    }
}
