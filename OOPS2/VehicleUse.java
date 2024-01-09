package OOPS2;

public class VehicleUse {
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        v.setColor("Blue");
        v.maxSpeed = 250;
        v.print();

        Car c = new Car();
        c.setColor("Black  ");
        c.maxSpeed = 250;
        c.numDoors = 5;
        c.printCar();

        Bicycle b = new Bicycle();
        b.print();
    }
}
