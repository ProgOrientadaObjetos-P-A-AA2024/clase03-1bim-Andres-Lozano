
package manejoclases03;

/**
 *
 * @author reroes
 */
public class Ejecutable02 {
    
    public static void main(String[] args) {
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        h1.establecerNombre("Vaca Ortíz");
        h2.establecerNombre("Militar");
        h3.establecerNombre("Manuel IM");
        /*
        lo que imprime es 0 por que al metodo OBTENER no se le da ningun valor 
        y por defecto el valor es 0
        */
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        /*
        h1.establecerNombre("Hospital Vaca Ortíz");
        
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        
        System.out.println("------------------");
        
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
        
        */
    }
}
