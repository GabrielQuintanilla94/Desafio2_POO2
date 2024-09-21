import javax.swing.JOptionPane; // Importa la clase JOptionPane para mostrar cuadros de diálogo.
import java.util.ArrayList;     // Importa la clase ArrayList para manejar listas dinámicas.
import java.util.List;          // Importa la interfaz List para definir listas genéricas.

public class TodoPC {
    // Listas estáticas para almacenar los diferentes tipos de equipos (desktops, laptops, tablets).
    private static List<Desktop> desktops = new ArrayList<>();
    private static List<Laptop> laptops = new ArrayList<>();
    private static List<Tablet> tablets = new ArrayList<>();

    public static void main(String[] args) {
        // Arreglo de opciones para el menú principal: Registrar, Ver equipos, o Salir.
        String[] opcionesMenu = {"Registrar equipo", "Ver equipos", "Salir"};
        String[] opcionesTipo = {"Desktops", "Laptops", "Tablets"};

        int opcion;

        do {
            // Muestra el menú principal con opciones.
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            switch (opcion) {
                case 0: // Registrar equipo.
                    int tipoRegistro = JOptionPane.showOptionDialog(null, "Seleccione el tipo de equipo:", "Registro de Equipo",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesTipo, opcionesTipo[0]);
                    registrarEquipo(tipoRegistro);
                    break;
                case 1: // Ver equipos.
                    int tipoVer = JOptionPane.showOptionDialog(null, "Seleccione el tipo de equipo a ver:", "Ver Equipos",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesTipo, opcionesTipo[0]);
                    verEquipos(tipoVer);
                    break;
                case 2: // Salir
                    JOptionPane.showMessageDialog(null, "Saliendo de la aplicación");
                    break;
                default:
                    break;
            }
        } while (opcion != 2);
    }


    private static String solicitarDato(String mensaje) {
        String input;
        do {
            input = JOptionPane.showInputDialog(mensaje);
            if (input == null || input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío. Por favor, ingrese un valor.");
            }
        } while (input == null || input.trim().isEmpty());
        return input;
    }

    private static void registrarEquipo(int tipoRegistro) {
        switch (tipoRegistro) {
            case 0: // Desktop
                String fabricante = solicitarDato("Ingrese el fabricante:");
                String modelo = solicitarDato("Ingrese el modelo:");
                String microprocesador = solicitarDato("Ingrese el microprocesador:");
                String memoria = solicitarDato("Ingrese la memoria:");
                String tarjetaGrafica = solicitarDato("Ingrese la tarjeta gráfica:");
                String tamanoTorre = solicitarDato("Ingrese el tamaño de la torre:");
                String capacidadDiscoDuro = solicitarDato("Ingrese la capacidad del disco duro:");
                desktops.add(new Desktop(fabricante, modelo, microprocesador, memoria, tarjetaGrafica, tamanoTorre, capacidadDiscoDuro));
                break;
            case 1: // Laptop
                fabricante = solicitarDato("Ingrese el fabricante:");
                modelo = solicitarDato("Ingrese el modelo:");
                microprocesador = solicitarDato("Ingrese el microprocesador:");
                memoria = solicitarDato("Ingrese la memoria:");
                String TamanoPantalla = solicitarDato("Ingrese el tamaño de la pantalla :");   //cambiamos este campo
                capacidadDiscoDuro = solicitarDato("Ingrese la capacidad del disco duro:");
                laptops.add(new Laptop(fabricante, modelo, microprocesador, memoria, TamanoPantalla, capacidadDiscoDuro));
                break;
            case 2: // Tablet
                fabricante = solicitarDato("Ingrese el fabricante:");
                modelo = solicitarDato("Ingrese el modelo:");
                microprocesador = solicitarDato("Ingrese el microprocesador:");
                String tamanoPantalla = solicitarDato("Ingrese el tamaño de la pantalla:");
                String tipoPantalla = solicitarDato("Ingrese el tipo de pantalla (Capacitiva/Resistiva):");
                String tamanoMemoriaNAND = solicitarDato("Ingrese el tamaño de la memoria NAND:");
                String sistemaOperativo = solicitarDato("Ingrese el sistema operativo:");
                tablets.add(new Tablet(fabricante, modelo, microprocesador, tamanoPantalla, tipoPantalla, tamanoMemoriaNAND, sistemaOperativo));
                break;
            default:
                break;
        }
    }


    private static void verEquipos(int tipoVer) {
        String marca = solicitarDato("Ingrese la marca a buscar:");

        switch (tipoVer) {
            case 0: // Desktops
                StringBuilder desktopList = new StringBuilder("Desktops de la marca " + marca + ":\n\n");
                for (Desktop desktop : desktops) {
                    if (desktop.getFabricante().equalsIgnoreCase(marca)) {
                        desktopList.append(desktop.toString()).append("\n");
                    }
                }
                if (desktopList.toString().equals("Desktops de la marca " + marca + ":\n\n")) {
                    desktopList.append("No se encontraron Desktops de la marca especificada.");
                }
                JOptionPane.showMessageDialog(null, desktopList.toString());
                break;
            case 1: // Laptops
                StringBuilder laptopList = new StringBuilder("Laptops de la marca " + marca + ":\n\n");
                for (Laptop laptop : laptops) {
                    if (laptop.getFabricante().equalsIgnoreCase(marca)) {
                        laptopList.append(laptop.toString()).append("\n");
                    }
                }
                if (laptopList.toString().equals("Laptops de la marca " + marca + ":\n\n")) {
                    laptopList.append("No se encontraron Laptops de la marca especificada.");
                }
                JOptionPane.showMessageDialog(null, laptopList.toString());
                break;
            case 2: // Tablets
                StringBuilder tabletList = new StringBuilder("Tablets de la marca " + marca + ":\n\n");
                for (Tablet tablet : tablets) {
                    if (tablet.getFabricante().equalsIgnoreCase(marca)) {
                        tabletList.append(tablet.toString()).append("\n");
                    }
                }
                if (tabletList.toString().equals("Tablets de la marca " + marca + ":\n\n")) {
                    tabletList.append("No se encontraron Tablets de la marca especificada.");
                }
                JOptionPane.showMessageDialog(null, tabletList.toString());
                break;
            default:
                break;
        }
    }
}

