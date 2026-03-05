package abstractfactory.products;

/**
 * Producto Concreto: MacButton
 * Implementación del botón con apariencia y comportamiento de macOS.
 */
public class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("[Mac] Renderizando botón con estilo macOS.");
    }

    @Override
    public void onClick() {
        System.out.println("[Mac] Botón presionado: ejecutando acción estilo macOS.");
    }
}
