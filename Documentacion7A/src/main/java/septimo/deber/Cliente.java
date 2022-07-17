
package septimo.deber;
/**
 * Clase cliente-Inicializa los atributos del cliente
 * @author EDUARDO
 * @version 5.0
 * @since 1.8
 */
public class Cliente {
    //Atributos
    /**
     * nombre del cliente
     */
    String nombre;
     /**
     * apellido del cliente
     */
    String apellido;
     /**
     * genero del cliente
     */
    char genero;
     /**
     * edad del cliente
     */
    int edad; 
   //metodo publicos
/**
 *Constructor con 4 parametros
 * @param nombre nombre del cliente
 * @param apellido apellidos dle cliente
 * @param genero genero del cliente
 * @param edad edad cliente
 */
    public Cliente(String nombre, String apellido, char genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }
    
    /**
     * Constrctor basio
     */
     public Cliente() {
       
    }
   
}
