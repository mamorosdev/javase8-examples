package com.java8intro.optional;

import java.util.ArrayList;
import java.util.List;

import com.java8intro.Persona;
 
public class PeopleServiceNoOptional {
     
    static List<Persona> lista= new ArrayList<Persona>();
    static {  
    	lista.add(new Persona("Miquel"));
    	lista.add(new Persona("Alicia"));
    	lista.add(new Persona("Sandra"));
    	lista.add(new Persona("Carles"));
    }
    
    public Persona buscar(String nombre) {
         for (Persona p:lista) {   
             if (p.getNombre().equals(nombre)) {
                 return p;
             }
         } 
         return null;
    }
     
}