
package septimo.deber;
/**
 * Clase Factura -Facturar
 * @author EDUARDO
 * @version 5.0
 * @since 1.8
 */
public class Factura {
    String fecha_compra;
    String forma_pago;
    /**
     * Inicializacion d evalores
     * @param fecha_compra Fecha de compra
     * @param forma_pago Fecha de pago(Efectivo, tarjeta, etc)
     */

    public Factura(String fecha_compra, String forma_pago) {
        this.fecha_compra = fecha_compra;
        this.forma_pago = forma_pago;
    }
    /**
     * Metodo que retorna el valor total de la factura
     * @param cantidad catidad de productos a comprar
     * @param valor valor del producto
     * @param descuento porcentaje de descuento
     * @return Retorna el valor de la factura con descuento
     */
    
    public double valor_total (int cantidad, double valor, double descuento){
        return (valor-(valor*descuento))*cantidad;
    }
    /**
     * Metodo que retorna el valor total de cada producto
     * @param cantidad cantidad del rpoducto
     * @param valor valor individual
     * @return ArithmeticException control de divicion para 0
     */
    
    public double valor_total (int cantidad, double valor){
        return valor*cantidad;
    }
    /**
     * Metodo que retorna el valor individual de cada producto
     * @param cantidad
     * @param valor
     * @return
     * @throws ArithmeticException 
     */
    public double valor_individual (int cantidad, double valor) throws ArithmeticException{
        return valor/cantidad;
    }
}
