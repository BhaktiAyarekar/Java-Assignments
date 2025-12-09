interface Drivable {
    void startEngine();
    void stopEngine();
}

class Car implements Drivable {

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.startEngine();  
        myCar.stopEngine();  
    }
}
