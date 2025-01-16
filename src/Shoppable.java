public interface Shoppable {

    static final int SHOP_VERSION = 1;

    double getPrice();

    int getStock();

    default String getCondition() {
        return "New";
    }

}
