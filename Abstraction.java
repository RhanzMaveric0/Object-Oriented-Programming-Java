abstract class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public abstract void start();
    
    public void stop() {
        System.out.println(brand + " is stopping");
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    
    @Override
    public void start() {
        System.out.println(brand + " car is starting with ignition");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }
    
    @Override
    public void start() {
        System.out.println(brand + " motorcycle is starting with kick");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.start();
        car.stop();
        
        System.out.println();
        
        Vehicle bike = new Motorcycle("Honda");
        bike.start();
        bike.stop();
    }
}
