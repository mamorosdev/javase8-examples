package com.java8intro.optional;

import java.util.ArrayList;
import java.util.List;

import com.java8intro.Persona;

public class MainWithoutOptional {
	 
	 public static void main(String[] args) {
	 
		 PeopleServiceNoOptional sp= new PeopleServiceNoOptional();
		 
		 // Diamond operator avaliable since Java 7.
		 List<String> testPeople = new ArrayList<>();
		 testPeople.add("Carles");
		 testPeople.add("Judit");
		 testPeople.add("Sandra");
		 testPeople.add("Raul");
		 
		 for(String testPerson : testPeople) {
			 Persona per = sp.buscar(testPerson);
			 if(per!=null) {
		    	 System.out.println(per.getNombre());
		     } else {
		    	 System.out.println("No existe el registro.");
		     }
		 }
	     
	}
}
