package Behavioral.Mediator.Components;

import Behavioral.Mediator.Mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}