import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @Test
            void testInstantiateBikePrice() {
            Bike bike = new Bike("Foo", 100);
            assertEquals(100, bike.getPrice());
    }
}