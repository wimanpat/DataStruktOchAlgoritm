public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mersu",5000);
        Bike bike = new Bike("Scott");

        Car car2 = new Car("Fiat");
        car2.refuel();;

        Car todaysVehicle;
        todaysVehicle= car;

        System.out.println("I dag åker jag "+ todaysVehicle.getName());
        //upcasting
        System.out.println(car.soundWarning());

        System.out.printf("%s kostar %2f\n", car.getName(), car.getPrice());
        System.out.printf("%s is %s\n", car.getName(), car.getType());
        System.out.println(car.soundWarning());

        System.out.printf("%s kostar %2f\n", car2.getName(), car2.getPrice());

        System.out.println(bike.getName()+ " is " +bike.getType());

        Shirt shirt = new Shirt("Polo Ralph Lauren");
        System.out.println(shirt.getBrand()+" is "+ shirt.getColor() + " and costs "+ shirt.getPrice());


    }}