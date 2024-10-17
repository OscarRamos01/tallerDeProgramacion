
/**
 *Crea una clase llamada Coche que tenga los siguientes atributos:
marca (String)
modelo (String)
año (int)
velocidadMaxima (int)
Incluye un constructor para inicializar los atributos.
Crea un método llamado mostrarDetalles que imprima la información del coche.
Agrega un método llamado esCocheRapido que devuelva true si la velocidad máxima es mayor a 200 km/h.
 */
    
   public class Coche {
    String marca, modelo;
    int año, velocidadMaxima;

    // Constructor
    public Coche(String marca, String modelo, int año, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("La marca del coche es: " + marca);
        System.out.println("El modelo del coche es: " + modelo);
        System.out.println("El año del coche es: " + año);
        System.out.println("La velocidad máxima del coche es: " + velocidadMaxima + " km/h");
    }

    // Método para verificar si el coche es rápido
    public boolean esCocheRapido() {
        return velocidadMaxima >= 200;
    }

    public static void main(String[] args) {
        // Crear un objeto Coche
        Coche coche1 = new Coche("Hyundai", "Grand i10", 2019, 150);

        // Mostrar detalles del coche
        coche1.mostrarDetalles();

        // Verificar si el coche es rápido
        if (coche1.esCocheRapido()) {
            System.out.println("Este coche es rápido.");
        } else {
            System.out.println("Este coche no es tan rápido.");
        }
    }
}
