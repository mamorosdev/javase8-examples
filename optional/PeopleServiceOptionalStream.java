package com.java8intro.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.java8intro.Persona;
 
public class PeopleServiceOptionalStream {
     
    static List<Persona> lista= new ArrayList<Persona>();
    static {  
    	lista.add(new Persona("Miquel"));
    	lista.add(new Persona("Alicia"));
    	lista.add(new Persona("Sandra"));
    	lista.add(new Persona("Carles"));
    }
    
    public Optional<Persona> buscar(String nombre) {	 
    	return lista.stream().filter(p->p.getNombre()==nombre).findFirst();
    }
     
}