package Creational.Factory.Buttons;

import Creational.Factory.Buttons.Button;

/**
 * HTML button implementation.
 */

public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}