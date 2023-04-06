package BS1328;

public class introClass {
    public static void main(String[] args) {

//        Car benz;
//        benz = new Car();

        Car benz = new Car(); //benz is object of class Car

//        benz.price=15000000;
//        benz.mileage=15;
//        benz.doors=4;

        //or,
        //Car benz = new Car(1,2,3); //benz is object of class Car

        //or,

        //will output public 10,20,30 if not set
        benz.setPrice(15000000);
        benz.setMileage(15);
        benz.setDoors(4);

        System.out.println("Benz: Price (BDT) = "+benz.getPrice()+", "+"Mileage (km/hr) = "+benz.getMileage()+", "+"Door(s) = "+benz.getDoors());

        //implementing encapsulation
        System.out.println(benz.Start());
        benz.Stop();

        // will use the no parameter method
        //Car audi = new Car();

        //System.out.println("Audi: Price (BDT) = "+audi.price+", "+"Mileage (km/hr) = "+audi.mileage+", "+"Door(s) = "+audi.doors);

        //using super (of parent class Car) constructor
        DirtyCar dirtyBenz = new DirtyCar(100, 200,300, 400);

//        dirtyBenz.setPrice(11);
//        dirtyBenz.setMileage(22);
//        dirtyBenz.setDoors(33);
//        dirtyBenz.setDirtyTopSpeed(44);

        System.out.println("Dirty Benz: Price (BDT) = "+dirtyBenz.getPrice()+", "+"Mileage (km/hr) = "+dirtyBenz.getMileage()+", "+"Door(s) = "+dirtyBenz.getDoors());

        //dirtyBenz.Start(); //will also work

        //using super keyword
        System.out.println(dirtyBenz.dirtyCarStart());

    }
}
