// Herencia: ProductoElectronico hereda de Producto
public class ProductoElectronico extends Producto {
    
    // Atributo exclusivo de esta subclase
    private int garantiaMeses;

    // Constructor de la subclase
    public ProductoElectronico(String nombre, double precio, int stock, int garantiaMeses) {
        super(nombre, precio, stock); // super() reutiliza el constructor de la clase base
        this.garantiaMeses = garantiaMeses;
    }

    // Sobrescritura de método (@Override): Amplía la funcionalidad del método heredado
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Muestra primero los datos de la clase base
        System.out.println("Garantía: " + garantiaMeses + " meses."); // Añade el dato exclusivo
    }

    // Método exclusivo de la subclase (comportamiento único)
    public void aplicarDescuentoEspecial() {
        this.precio = this.precio * 0.85; // Aplica un 15% de descuento
        System.out.println("¡Descuento de electrónico aplicado! Nuevo precio: $" + this.precio);
    }
}