
package septimo.deber;
/**
 * Clase producto-inicializa atributos del producto mediante constructores
 * @author EDUARDO
 * @version 5.0
 * @since 1.8
 */
public class Producto {
    String nombre;
    int cantidad; 
    double valor;
    double descuento;
    /**
     * Inicializa 4 productos
     * @param nombre Nombre del producto
     * @param cantidad stock del producto
     * @param valor valor unitario del producto
     * @param descuento porcentaje descuento dle producto
     */

    public Producto(String nombre, int cantidad, double valor, double descuento) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
        this.descuento = descuento;
    }
     /**
     * Inicializa 4 productos
     * @param nombre Nombre del producto
     * @param cantidad stock del producto
     * @param valor valor unitario del producto
     */

    public Producto(String nombre, int cantidad, double valor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
    }
    
}
