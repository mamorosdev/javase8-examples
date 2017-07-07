package com.java8intro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Ordenar una lista de personas por nombre con Java 8 Lambdas.
 * @author MiquelÀngel
 *
 */
public class Java8SortList {
   
   public static void main(String[] args) {
   
     ArrayList<Persona> milista= new ArrayList<Persona>();
     milista.add(new Persona("Miquel"));
     milista.add(new Persona("Alicia"));
     milista.add(new Persona("Sandra"));
     milista.add(new Persona("Carles"));
     
     // Así se hacía antes de Java 8.
     Collections.sort(milista,new Comparator<Persona>() {
       public int compare(Persona p1,Persona p2) {
         return p1.getNombre().compareTo(p2.getNombre());
       }
     });
     System.out.println("Ordenacion antes Java 8");
     for (Persona p: milista) {
       System.out.println(p.getNombre()); 
     }
     
    /* 
     * En Java 8 se pueden usar expresiones lambda, formadas por:
     * (parametros) -> { funcion }
     */
     System.out.println("Ordenacion con Java 8 Lambdas.");
     Collections.sort(milista,
      (Persona p1,Persona p2)-> p1.getNombre().compareTo(p2.getNombre()));
    
    for (Persona p: milista) {
      System.out.println(p.getNombre()); 
    }
  }
}