
// Subclase Tablet que extiende de la clase Equipo
public class Tablet extends Equipo {
    // Atributos específicos de la clase Tablet
    private String tamanoPantalla;
    private String tipoPantalla;
    private String tamanoMemoriaNAND;
    private String sistemaOperativo;
    
    // Constructor que inicializa los atributos tanto de la clase padre (Equipo) como los específicos de Tablet
    public Tablet(String fabricante, String modelo, String microprocesador, String tamanoPantalla, String tipoPantalla, String tamanoMemoriaNAND, String sistemaOperativo) {
        // Llamada al constructor de la clase padre (Equipo) para inicializar sus atributos
        super(fabricante, modelo, microprocesador);
        // Inicialización de los atributos específicos de la clase Tablet
        this.tamanoPantalla = tamanoPantalla;
        this.tipoPantalla = tipoPantalla;
        this.tamanoMemoriaNAND = tamanoMemoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }
    // Sobrescribe el método toString para incluir los atributos específicos de Tablet
    @Override
    public String toString() {
        // Llama al método toString de la clase padre (Equipo) y añade los detalles adicionales de Tablet
        return super.toString() + " \nTamaño Pantalla: " + tamanoPantalla + " \nTipo Pantalla: " + tipoPantalla + " \nTamaño Memoria NAND: " + tamanoMemoriaNAND + " \nSistema Operativo: " + sistemaOperativo;
    }
}