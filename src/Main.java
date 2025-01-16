import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.multiply(2,5));

        BikeShop shop = new BikeShop();

        shop.addBike(new Bike ("Scott", 600));
        shop.addBike(new Bike ("Nishiki", 500));
        shop.addBike(new Bike ("Insera", 200));

        shop.getBike(0).addFeature("suspension","hardtail");
        shop.getBike(0).addFeature("wheelsize","29 inch");
        System.out.println(shop.getBike(0).getFeature("suspension"));

        System.out.println("Välkommen till BikeShop! ");
        ArrayList<Bike> bikes = shop.getBikes();
        for (int i =0; i < shop.getBikeCount(); i++) {
            Bike currentBike = shop.getBike(i);
            System.out.printf("%s %.2f € lagersaldo: %s\n",
                  currentBike.getName(),
                   currentBike.getPrice(),
                   currentBike.getStock()
            );

            System.out.println(currentBike.getFeatures());
        }

        System.exit(0);

        Car car = new Car("Mersu",5000);
        Bike bike = new Bike("Scott");

        Car car2 = new Car("Fiat");
        car2.refuel();;
        // default-konstruktor
        Foo foo = new Foo();

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

        System.out.println(shirt.getBrand()+ " kostar " + shirt.getPrice()+ " skick: " + shirt.getCondition());
        System.out.printf("%s kostar %.2f €, lagersaldo: %d",shirt.getBrand(),shirt.getPrice(),shirt.getStock());

        String shirtInfo = String.format("%s kostar %.2f € lagersaldo: %d",
                shirt.getBrand(),shirt.getPrice(),shirt.getStock());
        System.out.println(shirtInfo);



    }}
