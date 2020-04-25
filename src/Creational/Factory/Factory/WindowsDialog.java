package Creational.Factory.Factory;

import Creational.Factory.Buttons.Button;
import Creational.Factory.Buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}