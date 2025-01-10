public class Car extends Vehicle {

    private int fuel= 0;

    //overload
    public Car(String name) {
        super(name,"motorized");
        super.setPrice(10000.0);
    }

    public Car(String name, double price){
        super(name, "motorized");
        super.setPrice(price);
    }

    @Override
    public String soundWarning(){
        return "tut-tut";
    }

    public void refuel() {
        //this.fuel=100
    }
}

