
package guia8.pkg1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Guia81 {

  
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
      ArrayList<String> razas = new ArrayList<>();
      String opc;
        do {
            System.out.println("------MENU-------");
            System.out.println("1) Ingresar Raza");
            System.out.println("2) Mostrar razas");
            System.out.println("3) Salir");
            opc = read.next().toUpperCase();
            switch (opc) {
                case "1":
                    System.out.println("Ingrese una raza: ");
                    razas.add(read.next());
                    break;
                case "2":
                    System.out.println("Las razas ingresadas hasta ahora son: ");
                    System.out.println(razas);
                    break;
                case "3":
                    System.out.println("Gracias por su colaboracion!");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida ");
            }
        } while (!opc.equals("3"));
        
    }
    
}
