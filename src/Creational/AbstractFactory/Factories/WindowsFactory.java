package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Buttons.Button;
import Creational.AbstractFactory.Buttons.WindowsButton;
import Creational.AbstractFactory.Checkboxes.Checkbox;
import Creational.AbstractFactory.Checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
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