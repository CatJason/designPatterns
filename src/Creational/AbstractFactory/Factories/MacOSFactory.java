package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Buttons.Button;
import Creational.AbstractFactory.Buttons.MacOSButton;
import Creational.AbstractFactory.Checkboxes.Checkbox;
import Creational.AbstractFactory.Checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}