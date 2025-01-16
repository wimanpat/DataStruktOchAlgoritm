import java.util.HashMap;

public class Bike extends Vehicle implements Shoppable{

    public Bike(String name) {
        super(name, "pedaled");

    }

    HashMap<String,String> features = new HashMap<>();


    public Bike(String name,double price) {
        super(name, "pedaled");
        this.setPrice(price);

    }

    public void addFeature(String key, String value) {

        features.put(key, value);

    }

    public String getFeature( String key) {
        return features.get(key);
    }

public String getFeatures() {
        String ret = "";
    for (String key : features.keySet()) {
        ret += String.format("%s: %s\n",key, features.get(key));

    }
    return ret;
}

    @Override
    public String soundWarning(){
        return "pling-pling";
    }


    /**
     * @return
     */
    @Override
    public int getStock() {
        return 0;
    }

    private class BikeFeatures {
        String suspension = "Hardtail";
        int gears = 1;

    }
}



