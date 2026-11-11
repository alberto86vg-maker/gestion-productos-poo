public class Producto {
    // Atributos base protegidos para que las subclases puedan acceder a ellos
    protected String nombre;
    protected double precio;
    protected int stock;

    // Constructor de la clase base
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método general que será heredado (y posteriormente sobrescrito)
    public void mostrarDetalles() {
        System.out.println("--- INFORMACIÓN DEL PRODUCTO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock + " unidades");
    }

    // Getters y Setters básicos
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}