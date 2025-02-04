import java.util.Arrays;

public class BigO {

   // int[] data = {1,3,5,7,9,8,6,4,2};
    int[] data = new int[100000];
    long opps;

    public BigO(){

        //System.out.println(Arrays.toString(data));
        System.out.printf("Datamängdens storlek: %d\n", data.length);
        /**
         * 0(n)
         */

        opps = 0;
        for (int i = 0; i <data.length ; i++) {
                opps++;
        }
        System.out.printf("O(n): %d operationer\n", opps);

        /**
         * O(n^2)
         */
        opps = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                opps++;

            }
        }
        System.out.printf("O(n^2): %d operationer\n", opps);
        /**
         * 0(log n)
         */
        opps = 0;
        int len = data.length;
        while (len > 0) {
            len /= 2;
            opps++;
        }
        System.out.printf("O(log n): %d operationer\n", opps);

        /**
         * 0(n log n) ( n * log n)
         */
        opps = 0;
        len = data.length;
        while (len > 0) {
            len /= 2;
            for (int i = 0; i < data.length ; i++) {
                opps++;
            }
        }
        System.out.printf("O(log n): %d operationer\n", opps);


    }

}
