package abstractfactory.products;

/**
 * Producto Concreto: MacCheckbox
 * Implementación del checkbox con apariencia y comportamiento de macOS.
 */
public class MacCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("[Mac] Renderizando checkbox con estilo macOS.");
    }

    @Override
    public void onToggle() {
        System.out.println("[Mac] Checkbox activado/desactivado: acción estilo macOS.");
    }
}
