import abstractfactory.client.Application;
import abstractfactory.factories.GUIFactory;
import abstractfactory.factories.MacFactory;
import abstractfactory.factories.WindowsFactory;

/**
 * Punto de entrada de la demostración del patrón Abstract Factory.
 *
 * El patrón Abstract Factory provee una interfaz para crear familias de
 * objetos relacionados o dependientes sin especificar sus clases concretas.
 *
 * En este ejemplo, la fábrica crea componentes de interfaz gráfica (Button y
 * Checkbox) para dos plataformas: Windows y macOS.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Patrón de Diseño: Abstract Factory ===\n");

        // Detectar sistema operativo para elegir la fábrica adecuada
        String os = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (os.contains("win")) {
            factory = new WindowsFactory();
            System.out.println("Sistema operativo detectado: Windows");
        } else {
            factory = new MacFactory();
            System.out.println("Sistema operativo detectado: macOS/Linux");
        }

        System.out.println();

        // El cliente trabaja con la fábrica a través de la interfaz abstracta
        Application app = new Application(factory);
        app.renderUI();
        System.out.println();
        app.interactUI();

        System.out.println("\n--- Demostración con ambas fábricas ---\n");

        System.out.println(">> Usando WindowsFactory:");
        Application winApp = new Application(new WindowsFactory());
        winApp.renderUI();
        System.out.println();
        winApp.interactUI();

        System.out.println();

        System.out.println(">> Usando MacFactory:");
        Application macApp = new Application(new MacFactory());
        macApp.renderUI();
        System.out.println();
        macApp.interactUI();
    }
}
