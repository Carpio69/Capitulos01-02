/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.Colecciones;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author cybertron
 */
public class UNombres 
{
        public static Collection<String> obtenerLista()
    {
        ArrayList<String> v = new ArrayList<String>();
        v.add("Pablo");
        v.add("Juan");
        v.add("Carlos");
        return v;
    }
}
