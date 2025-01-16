public class Shirt extends Clothing implements Shoppable{

    public Shirt(String brand){
        super.brand = brand;
        super.color = "Black";
        super.price = 200;

    }


    @Override
    public int getStock() {
        return 0;
    }
}
