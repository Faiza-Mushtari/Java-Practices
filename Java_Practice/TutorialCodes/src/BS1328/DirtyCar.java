package BS1328;

//implementing inheritance
public class DirtyCar extends Car {
    private int dirtyTopSpeed;

    public DirtyCar(int price, float mileage, int doors, int dirtyTopSpeed) {
        super(price, mileage, dirtyTopSpeed); //from parent class Car
        this.dirtyTopSpeed=dirtyTopSpeed;
    }

    public int getDirtyTopSpeed() {
        return dirtyTopSpeed;
    }

    public void setDirtyTopSpeed(int dirtyTopSpeed) {
        this.dirtyTopSpeed = dirtyTopSpeed;
    }


    //super keyword -> refer to parent class -> Car
    public String dirtyCarStart(){
        return "Dirty Benz "+ super.Start();
    }
}
