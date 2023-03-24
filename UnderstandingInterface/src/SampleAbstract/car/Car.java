package SampleAbstract.car;

public abstract class Car {
    //don't instantiate new Car class -> Car Audi != new Car()
    //class doesn't provide implementation for all new methods
    protected int doors;
    public abstract void setDoors();
}
