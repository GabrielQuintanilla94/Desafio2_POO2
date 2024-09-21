
// Subclase Laptop que extiende de la clase Equipo
public class Laptop extends Equipo {
    // Atributos específicos de la clase Laptop
    private String memoria;
    private String TamanoPantalla;
    private String capacidadDiscoDuro;
    // Constructor que inicializa los atributos tanto de la clase padre (Equipo) como los específicos de Laptop
    public Laptop(String fabricante, String modelo, String microprocesador, String memoria, String TamanoPantalla, String capacidadDiscoDuro) {
        // Llamada al constructor de la clase padre (Equipo) para inicializar sus atributos
        super(fabricante, modelo, microprocesador);
        // Inicialización de los atributos específicos de la clase Laptop
        this.memoria = memoria;
        this.TamanoPantalla = TamanoPantalla ;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }
    // Sobrescribe el método toString para incluir los atributos específicos de Laptop
    @Override
    public String toString() {
        // Llama al método toString de la clase padre (Equipo) y añade los detalles adicionales de Laptop
        return super.toString() + " \nMemoria: " + memoria + " \nTamano Pantalla: " + TamanoPantalla + " \nCapacidad de Disco Duro: " + capacidadDiscoDuro;
    }
}