import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.time.format.DateTimeFormatter;
import java.lang.Math;

/* 
 * Ejemplos tratamiento de fechas en Java 8. 
 */
public class Java8DatesIntro {
  
  public static void main(String[] args){
    
    // Test 1. Dias que quedan para fin de mes.
    final LocalDate hoy = LocalDate.now();
    final LocalDate finAno = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
    final int diasHastaFinMesJava8 = Period.between(hoy, finAno).getDays();
    System.out.println("diasHastaFinMesJava8 = " + diasHastaFinMesJava8);  
    
    // Test 2. Edad a partir de la fecha de nacimiento. Usando formato dd/MM/yyyy.
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate fechaNac = LocalDate.parse("15/11/1998", fmt);
    LocalDate ahora = LocalDate.now();

    Period periodo = Period.between(fechaNac, ahora);
    System.out.printf("Tu edad es: %s años, %s meses y %s días",
         periodo.getYears(), periodo.getMonths(), periodo.getDays());
  }
}
