
// Clase principal (superclase)
public class Equipo {
    // Atributos protegidos (pueden ser accedidos por clases hijas)
    protected String fabricante;
    protected String modelo;
    protected String microprocesador;

    // Constructor de la clase que inicializa los atributos del equipo
    public Equipo(String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante; // Asigna el fabricante
        this.modelo = modelo; // Asigna el modelo
        this.microprocesador = microprocesador; // Asigna el microprocesador
    }
    // Métodos 'getter' para acceder a los atributos desde fuera de la clase
    public String getFabricante() 
    { return fabricante; } // Retorna el fabricante
    public String getModelo() 
    { return modelo; } // Retorna el modelo
    public String getMicroprocesador() 
    { return microprocesador; } // Retorna el microprocesador
    
    // Método toString sobrescrito para representar el objeto como una cadena de texto
    // Proporciona una manera personalizada de mostrar la información de un equipo
    @Override
    public String toString() {
        return "Fabricante: " + fabricante + " \nModelo: " + modelo + " \nMicroprocesador: " + microprocesador;
    }
}



