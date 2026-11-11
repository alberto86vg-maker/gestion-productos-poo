public class Principal {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE HERENCIA EN JAVA ===");

        // 1. Instanciación de un objeto de la subclase ProductoElectronico
        ProductoElectronico laptop = new ProductoElectronico("Laptop Gamer", 18500.0, 5, 12);

        // 2. Probando el método heredado y sobrescrito
        laptop.mostrarDetalles();

        System.out.println("\n--- APLICANDO MÉTODO EXCLUSIVO ---");
        // 3. Probando el método único de la subclase
        laptop.aplicarDescuentoEspecial();
        
        System.out.println("\nMostrando detalles actualizados:");
        laptop.mostrarDetalles();
    }
}