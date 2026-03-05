package abstractfactory.products;

/**
 * Interfaz de Producto Abstracto: Button
 * Define las operaciones que todos los botones concretos deben implementar.
 */
public interface Button {

    /**
     * Renderiza el botón en pantalla.
     */
    void render();

    /**
     * Simula el evento de clic sobre el botón.
     */
    void onClick();
}
