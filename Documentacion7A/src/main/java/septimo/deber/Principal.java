
package septimo.deber;
/**
 * Clase principal -Ejecutar el programa
 * @author EDUARDO
 * @version 5.0
 * @since 1.8
 */
public class Principal {
    /**
     * Metodo Principa-Inicializa el programa
     */

    public static void main(String args[]) {
        Cliente cliente1 = new Cliente();
        
        cliente1.nombre = "Santiago";
        cliente1.apellido = "Jara";
        cliente1.genero = 'M';
        cliente1.edad = 29;
        
        Producto producto1 = new Producto("Agua", 2, 0.5);
        Producto producto2 = new Producto("Coca Cola", 5, 0.4, 0.05);
        
        Factura factura = new Factura("06-01-2021", "Efectivo");
        
        System.out.println("FACTURACIÓN DE COMPRA DE UN PRODUCTO");
        System.out.println("Fecha de compra: " + factura.fecha_compra);
        System.out.println("Forma de pago: " + factura.forma_pago);
        System.out.println("#########################################");
        System.out.println("Cliente: " + cliente1.nombre + " " + cliente1.apellido);
        System.out.println("Genero: " + cliente1.genero);
        System.out.println("Edad: " + cliente1.edad);
        System.out.println("#########################################");
        System.out.println("Producto: " + producto2.nombre);
        System.out.println("Cantidad: " + producto2.cantidad);
        System.out.println("Valor: " + producto2.valor);
        System.out.println("Descuento: " + producto2.descuento);
        System.out.println("#########################################");
        System.out.println("El valor total es: " + factura.valor_total(producto2.cantidad, producto2.valor, producto2.descuento));
        
                
    }
}
