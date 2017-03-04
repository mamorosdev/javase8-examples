package com.java8intro.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.java8intro.Persona;

public class MainWithOptional {
	 
	 public static void main(String[] args) {
		 
		 PeopleServiceOptional sps = new PeopleServiceOptional();
		 // PeopleServiceOptionalStream sp= new PeopleServiceOptionalStream();
		 
		 // Diamond operator avaliable since Java 7.
		 List<String> testPeople = new ArrayList<>();
		 testPeople.add("Carles");
		 testPeople.add("Judit");
		 testPeople.add("Sandra");
		 testPeople.add("Raul");
				 
		 for(String testPerson : testPeople) {
			 Optional<Persona> oper = sps.buscar(testPerson);
		     if (oper.isPresent()) {
		    	 System.out.println(oper.get().getNombre());
		     } else {
			   	 System.out.println("No existe el registro.");
		     }
		 }
	     
	}
}
