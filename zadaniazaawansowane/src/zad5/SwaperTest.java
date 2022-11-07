package zad5;

import java.math.BigDecimal;
import java.util.Arrays;

public class SwaperTest {
    public static void main(String[] args) {
        Swaper swaper = new Swaper();
        String[] strings = new String[]{"first", "second", "third", "fourth"};
        Integer[] ints = new Integer[]{1,2,3,4,5,6,7,8};
        BigDecimal[] bigDecimals = new BigDecimal[]{new BigDecimal(1), new BigDecimal(2),new BigDecimal(3)};

        System.out.println("before swap: " + Arrays.toString(strings));
        System.out.println("after swap elements 0,5: " + Arrays.toString(swaper.swapElementInArray(strings, 0, 5)));

        System.out.println();

        System.out.println("before swap: " + Arrays.toString(ints));
        System.out.println("after swap: elements 0,5: " + Arrays.toString(swaper.swapElementInArray(ints, 0, 5)));

        System.out.println();

        System.out.println("before swap: " + Arrays.toString(bigDecimals));
        System.out.println("after swap elements 1,0: " + Arrays.toString(swaper.swapElementInArray(bigDecimals, 1, 0)));
    }
}
