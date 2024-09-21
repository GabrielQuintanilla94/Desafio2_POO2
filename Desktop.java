
// Subclase Desktop que extiende de la clase Equipo
public class Desktop extends Equipo {
    // Atributos adicionales específicos de la clase Desktop
    private String memoria;
    private String tarjetaGrafica;
    private String tamanoTorre;
    private String capacidadDiscoDuro;
    
    // Constructor que inicializa los atributos tanto de la clase padre (Equipo) como los específicos de Desktop
    public Desktop(String fabricante, String modelo, String microprocesador, String memoria, String tarjetaGrafica, String tamanoTorre, String capacidadDiscoDuro) {
        // Llamada al constructor de la clase padre (Equipo) para inicializar sus atributos
        super(fabricante, modelo, microprocesador);
        // Inicialización de los atributos específicos de la clase Desktop
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }
    // Sobrescribe el método toString para incluir los atributos específicos de Desktop
    @Override
    public String toString() {
        // Llama al método toString de la clase padre (Equipo) y añade los detalles adicionales de Desktop
        return super.toString() + " \nMemoria: " + memoria + " \nTarjeta Gráfica: " + tarjetaGrafica + " \nTamaño de Torre: " + tamanoTorre + " \nCapacidad de Disco Duro: " + capacidadDiscoDuro;
    }
}