package Structural.Decorator.Decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}