//*******************************************************************
// Dear CompileJava users,
//
// CompileJava has been operating since 2013 completely free. If you
// find this site useful, or would otherwise like to contribute, then
// please consider a donation (link in 'More Info' tab) to support
// development of the new CompileJava website (stay tuned!).
//
// Most sincerely, Z.
//*******************************************************************

import java.lang.Math; 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuncionesJava8{

  public static void main(String[] args)
  {
        // Operaciones estadísticas con Java 8. 
        final List<Integer> lista = Arrays.asList(new Integer[] { 5, 8, 3, 8, 9, 6, 7, 5, 4, 5 });

        //  Sumar los elementos de una lista
        final int suma = lista.stream().mapToInt(a -> a).sum(); 
        
        // Hacer la media de los elementos de una lista:
        final double media = lista.stream().mapToDouble(a -> a).average().getAsDouble(); 
        
        System.out.println("lista => " + lista);
        System.out.println("suma = " + suma);
        System.out.println("media = " + media);
    
    	// Filtrar elementos lista por criterio.
    	final List<Integer> listaMayoresQueSeis = lista.stream().filter(a -> a > 6).collect(Collectors.toList());
    	System.out.println("listaMayoresQue6 => " + listaMayoresQueSeis);
    
    	// Modificar los elementos de la lista. (*2)
    	final List<Integer> listaValoresMultPor3 = lista.stream().map(b -> b * 3).collect(Collectors.toList());
    	System.out.println("listaValoresAlCuadrado => " + listaValoresMultPor3);

  }
}
