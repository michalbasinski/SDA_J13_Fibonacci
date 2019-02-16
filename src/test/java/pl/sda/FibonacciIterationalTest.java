package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FibonacciIterationalTest {

    @Test
    public void shouldReturn34WhenNEqTo9() {
        //given
        Fibonacci fibonacci = new FibonacciIterational();
        final int n = 9;
        final BigDecimal expectedResult = new BigDecimal(34);

        //when
        BigDecimal result = fibonacci.getN(n);

        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn1WhenNEqTo1() {
        //given
        Fibonacci fibonacci = new FibonacciIterational();
        final int n = 1;
        final BigDecimal expectedResult = new BigDecimal(1);

        //when
        BigDecimal result = fibonacci.getN(n);

        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldThrowExceptionWhenArgumentIsLessThanZero() {
        //given
        Fibonacci fibonacci = new FibonacciIterational();
        final int n = -1;

        //when
        try {
            fibonacci.getN(n);
            Assert.fail("Exception was not thrown");
        } catch (ArgumentLessThanZeroException e) {
            e.printStackTrace();
        }

    }
}