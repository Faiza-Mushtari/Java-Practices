package SampleAbstract.car;

public class Main {
    public static void main(String[] args) {
        BMW xBMW =  new BMW();
        Limo medLimo = new Limo();

        xBMW.setDoors();
        medLimo.setDoors();

        System.out.println(xBMW.doors);
        System.out.println(medLimo.doors);
    }
}
