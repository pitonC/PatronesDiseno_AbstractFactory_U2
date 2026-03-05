package abstractfactory.client;

import abstractfactory.factories.GUIFactory;
import abstractfactory.products.Button;
import abstractfactory.products.Checkbox;

/**
 * Cliente: Application
 * Trabaja con fábricas y productos únicamente a través de interfaces abstractas.
 * No conoce las clases concretas, lo que la hace independiente de la plataforma.
 */
public class Application {

    private final Button button;
    private final Checkbox checkbox;

    /**
     * Constructor que recibe una fábrica abstracta.
     * La fábrica determina qué familia de productos se usará.
     *
     * @param factory la fábrica que produce los componentes de la UI
     */
    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    /**
     * Renderiza todos los componentes de la interfaz gráfica.
     */
    public void renderUI() {
        System.out.println("--- Renderizando interfaz gráfica ---");
        button.render();
        checkbox.render();
    }

    /**
     * Simula la interacción del usuario con los componentes.
     */
    public void interactUI() {
        System.out.println("--- Interactuando con la interfaz gráfica ---");
        button.onClick();
        checkbox.onToggle();
    }
}
