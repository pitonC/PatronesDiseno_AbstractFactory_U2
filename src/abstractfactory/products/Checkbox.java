package abstractfactory.products;

/**
 * Interfaz de Producto Abstracto: Checkbox
 * Define las operaciones que todos los checkboxes concretos deben implementar.
 */
public interface Checkbox {

    /**
     * Renderiza el checkbox en pantalla.
     */
    void render();

    /**
     * Simula el evento de selección/deselección del checkbox.
     */
    void onToggle();
}
