import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String [] testData = {"Pat", "Ruuben", "Kimi", "Wille"};
        String [] sortedData = { "Robin", "Kimi","Matt", "Wille"};

        Person frodo = new Person(testData[0]);
        Person sam = new Person(testData[1]);
        Person gandalf = new Person(testData[2]);
        /**
         * Stack
         */
        Stacky stacky = new Stacky(5);
        stacky.push("Frodo");
        stacky.push("Sam");
        stacky.push("Gandalf");
        stacky.push("Gimli");
        stacky.push("Legolas");


        System.out.println(stacky.toString());

        System.out.println("");
        /**
         * Linked list
         */
        Linky linky = new Linky();
        linky.add(frodo);
        linky.add(sam);
        linky.add(gandalf);
        System.out.println(linky.toString());
        System.out.println("Linky has "+ linky.size());
        /**
         * Queuey
         */
        Queuey queuey = new Queuey();
        queuey.enqueue("Aragorn");
        queuey.enqueue("Arwen");
        System.out.println("Först i kön " + queuey.peek());
        System.out.println(queuey.toString());
        queuey.enqueue("Bilbo");
        System.out.println(queuey.toString());
        System.out.println("dequeue " + queuey.dequeue());
        System.out.println(queuey.toString());

        /* Code Challenge
        String []weekDays = {"må", "ti", "on", "to", "fr", "lö", "sö"};
        int today = 3;
        System.out.println("I dag är det "+ weekDays[today]);
        System.out.println("I övermorgon är det "+ weekDays[(today+2)%weekDays.length]);
        System.out.println("Om 6 dagar är det "+ weekDays[(today+6)%weekDays.length]);
        */


        /*
        Person p1 = new Person(testData[0]);
        Person p2 = new Person(testData[1],p1);
        Person p3 = new Person(testData[2],p2);
        Person p4 = new Person(testData[3],p3);

        System.out.println(p4.getName());
        Person current = p4;
        while (current!= null) {

            System.out.println(current.getName());
            current = current.next;
        }*/

        /*StringArray names = new StringArray(sortedData);
        System.out.println(names.toString());
        names.add("Gollum");
        System.out.println(names.toString());
        names.reverse();
        System.out.println(names.toString());*/

        System.exit(0);
       // testa loopa olika tidkomplexitet
       new BigO();


/*
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


*/
    }}
