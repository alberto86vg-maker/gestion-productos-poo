import java.util.Scanner;

public class Producto {
    // Atributos privados (Encapsulamiento)
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor para inicializar el objeto
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para calcular el valor total del inventario de este producto
    public double calcularTotal() {
        return this.precio * this.cantidad;
    }

    // Método para aplicar un descuento al precio
    public void aplicarDescuento(double porcentaje) {
        this.precio -= this.precio * (porcentaje / 100);
    }

    // Método para verificar disponibilidad
    public boolean estaDisponible() {
        return this.cantidad > 0;
    }

    // Método para mostrar la información del producto
    public void mostrarInfo() {
        System.out.println(this.nombre + " : $" + String.format("%.2f", this.precio));
        System.out.println("Disponible: " + this.estaDisponible());
    }

    // Programa principal (Main) para probar la aplicación
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instanciación del objeto
        Producto producto1 = new Producto("Teclado Mecánico", 500.0, 10);

        int opcion;
        do {
            System.out.println("\n--- MENÚ DE GESTIÓN DE PRODUCTOS ---");
            System.out.println("1. Mostrar información");
            System.out.println("2. Aplicar descuento");
            System.out.println("3. Calcular total en inventario");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    producto1.mostrarInfo();
                    break;
                case 2:
                    System.out.print("Ingresa el porcentaje de descuento: ");
                    double descuento = scanner.nextDouble();
                    producto1.aplicarDescuento(descuento);
                    System.out.println("¡Descuento aplicado con éxito!");
                    break;
                case 3:
                    System.out.println("Total del inventario: $" + producto1.calcularTotal());
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }
}