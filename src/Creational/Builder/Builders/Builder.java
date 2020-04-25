package Creational.Builder.Builders;

import Creational.Builder.Cars.Type;
import Creational.Builder.Components.Engine;
import Creational.Builder.Components.GPSNavigator;
import Creational.Builder.Components.Transmission;
import Creational.Builder.Components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}