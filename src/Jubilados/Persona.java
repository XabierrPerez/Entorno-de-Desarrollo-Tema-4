package Jubilados;
/**
 * Clase persona, para almacenar y calcular la edad de estas
 */
public class Persona {
    private int edadActual;
    
    /**
     * Constructor de la clase Persona
     * @param edadActual Edad introducida por el usuario
    */
    public Persona(int edadActual) {
        this.edadActual = edadActual;
    }
    
    /**
     * Metodo que devuelve el numero de anios restantes para la jubilacion con un mensaje de animo, dependiendo de los años restantes
     */
    public void calcularAniosHastaJubilacion() {
        int aniosHastaJubilacion = 67 - edadActual;
        
        if (aniosHastaJubilacion < 10) {
            System.out.println("Sólo te quedan " + aniosHastaJubilacion + " años. ¡Vamos que ya queda poco!");
        } else if (aniosHastaJubilacion > 20) {
            System.out.println("Te quedan " + aniosHastaJubilacion + " años. ¡A seguir trabajando gandul!");
        } else {
            System.out.println("Te quedan " + aniosHastaJubilacion + " años hasta la jubilación.");
        }
    }
}
