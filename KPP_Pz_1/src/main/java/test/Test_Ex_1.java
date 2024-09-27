package test;

import org.example.Ex_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Ex_1 {

    @Test
    public void testMaxElem() {
        Ex_1 ex1 = new Ex_1();
        int[] mas = new int[] {3, 5, 6, -7, 8, -4};

        Assertions.assertEquals(8, ex1.maxElement(mas));

        mas = new int[] {-11, -7 , -5 , -55, -9};

        Assertions.assertEquals(-5, ex1.maxElement(mas));
    }

    @Test
    public void testSumma() {
        Ex_1 ex1 = new Ex_1();
        int[] mas = new int[] {3, -15, 6, -7, 8, -4};

        Assertions.assertEquals(-15, ex1.summaWithFirstAndSecondPositiveElements(mas));

        mas = new int[] {11, -7 , -5 , -55, 9, 7, 9, 0};

        Assertions.assertEquals(-67, ex1.summaWithFirstAndSecondPositiveElements(mas));

    }

}

