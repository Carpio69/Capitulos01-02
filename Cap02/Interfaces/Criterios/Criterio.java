/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Interfaces.Criterios;

/**
 *
 * @author cybertron
 */
public abstract class Criterio<T> 
{
    public abstract int comparar(T a, T b);
}
