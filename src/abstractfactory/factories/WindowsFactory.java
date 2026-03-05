package abstractfactory.factories;

import abstractfactory.products.Button;
import abstractfactory.products.Checkbox;
import abstractfactory.products.WindowsButton;
import abstractfactory.products.WindowsCheckbox;

/**
 * Fábrica Concreta: WindowsFactory
 * Crea la familia de productos con estilo Windows.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
