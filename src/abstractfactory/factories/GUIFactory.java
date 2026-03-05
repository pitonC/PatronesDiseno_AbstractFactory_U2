package abstractfactory.factories;

import abstractfactory.products.Button;
import abstractfactory.products.Checkbox;

/**
 * Interfaz de Fábrica Abstracta: GUIFactory
 * Declara los métodos de creación para cada tipo de producto de la familia GUI.
 * Cada familia de productos (Windows, Mac) tiene su propia fábrica concreta.
 */
public interface GUIFactory {

    /**
     * Crea un producto de tipo Button correspondiente a la familia.
     *
     * @return una instancia de Button
     */
    Button createButton();

    /**
     * Crea un producto de tipo Checkbox correspondiente a la familia.
     *
     * @return una instancia de Checkbox
     */
    Checkbox createCheckbox();
}
