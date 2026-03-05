package abstractfactory.factories;

import abstractfactory.products.Button;
import abstractfactory.products.Checkbox;
import abstractfactory.products.MacButton;
import abstractfactory.products.MacCheckbox;

/**
 * Fábrica Concreta: MacFactory
 * Crea la familia de productos con estilo macOS.
 */
public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
