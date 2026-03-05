package abstractfactory.products;

/**
 * Producto Concreto: WindowsCheckbox
 * Implementación del checkbox con apariencia y comportamiento de Windows.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("[Windows] Renderizando checkbox con estilo Windows.");
    }

    @Override
    public void onToggle() {
        System.out.println("[Windows] Checkbox activado/desactivado: acción estilo Windows.");
    }
}
