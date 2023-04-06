package BS1328;

public class Car {
    //fields are set private - encapsulation
    private int price, doors; //fields
    private float mileage;

    //constructor - special method - create objects - implicitly/automatically called
    public Car(int price, float mileage, int doors){
        this.price=price; //assigns method's price to class field price
        this.doors=doors;
        this.mileage=mileage;
    }

   //multiple constructor
    public Car(){
//        this.price=10;
//        this.doors=20;
//        this.mileage=30;

        //or,
        this(10,20,30);

    }

    //functions
    public String Start(){

        return "Car started";
    }
    public void Stop(){

        System.out.println("Car stopped");
    }

    //getter and setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }
}
