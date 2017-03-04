package com.java8intro.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.java8intro.Persona;
 
public class PeopleServiceOptional {
     
    static List<Persona> lista= new ArrayList<Persona>();
    static {  
    	lista.add(new Persona("Miquel"));
    	lista.add(new Persona("Alicia"));
    	lista.add(new Persona("Sandra"));
    	lista.add(new Persona("Carles"));
    }
    
    public Optional<Persona> buscar(String nombre) {
        for (Persona p:lista) { 
            if (p.getNombre()==nombre) {
                return  Optional.of(p);
            }
        }
        return Optional.empty();
   }
     
}