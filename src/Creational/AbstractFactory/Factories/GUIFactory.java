package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Buttons.Button;
import Creational.AbstractFactory.Checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}