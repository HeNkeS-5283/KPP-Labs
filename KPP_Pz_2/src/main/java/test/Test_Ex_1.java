package test;

import org.example.Ex_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Ex_1 {
    @Test
    public void testMaxAndMinElem() {
        Ex_1 ex1 = new Ex_1();
        int[] mas = new int[] {6, 9, 0, -7, 12, 14};

        Assertions.assertEquals(14, ex1.maxElement(mas));
        Assertions.assertEquals(-7, ex1.minElement(mas));

        mas = new int[] {-11, -7 , -5 , -55, -9};

        Assertions.assertEquals(-5, ex1.maxElement(mas));
        Assertions.assertEquals(-55, ex1.minElement(mas));
    }

    @Test
    public void testArithmeticMean() {
        Ex_1 ex1 = new Ex_1();
        int[] mas = new int[] {3, -15, 6, -7, 8, -4};

        Assertions.assertEquals(-3.5, ex1.arithmeticMean(mas));

        mas = new int[] {11, -7 , -5 , -55, 9, 7, 9, 0};

        Assertions.assertEquals(-22, ex1.arithmeticMean(mas));

    }
}
