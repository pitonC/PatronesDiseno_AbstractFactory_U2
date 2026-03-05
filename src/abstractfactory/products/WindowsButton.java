package abstractfactory.products;

/**
 * Producto Concreto: WindowsButton
 * Implementación del botón con apariencia y comportamiento de Windows.
 */
public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("[Windows] Renderizando botón con estilo Windows.");
    }

    @Override
    public void onClick() {
        System.out.println("[Windows] Botón presionado: ejecutando acción estilo Windows.");
    }
}
