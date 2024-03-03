package Jubilados;

//import statements
import java.util.Scanner;

/**
* Clase principal del proyecto, que pide la edad en años al usuario y calcula los años que le quedan para jubilarse.
* @author      Firstname Lastname xperez649k@fpdrioja.com
* @version     1.0          (current version number of program)
* @since       1.0          (the version of the package this class was first added to)
*/

public class Main {
    public static void main(String[] args) {
    	// Iniciamos el lector
        Scanner scanner = new Scanner(System.in);
        
        /** 
         * Mostramos un mensaje por panalla para informar al usuario de la accion que requiere
         */
        System.out.print("Ingrese su edad en años: ");
        
        /**
         * Variable que almacena la respuesta del usuario (La edad)
         */
        int edad = scanner.nextInt();
        
        /** 
         * Se crea el objeto persona y se le pasa como parametro la edad
         * @param edad Edad introducida por el usuario
         */
        Persona persona = new Persona(edad);
        
        /** 
         * Se llama a la funcion, de la clase persona, encargada de calcular los años
         */
        persona.calcularAniosHastaJubilacion();
    }
}
