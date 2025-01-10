public class Vehicle {

    private String name;
    private String type;
    Double price = 0.0;
    Double discount = 0.9;

    public Vehicle(String name, String type) {
        this.type = type;
        this.name = name;
    }

    public String soundWarning(){
        return "silence";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price*discount;

    }
    public void setPrice(Double price) {
        if(price <0) throw new RuntimeException("Price cannot be negative");
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }


}
