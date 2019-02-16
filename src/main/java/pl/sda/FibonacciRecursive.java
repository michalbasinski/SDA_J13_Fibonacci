package pl.sda;

import java.math.BigDecimal;

public class FibonacciRecursive implements Fibonacci {

    @Override
    public BigDecimal getN(int n) {
        valideN(n);

        if (n == 0 || n == 1) {
            return new BigDecimal(n);
        } else {
            return getN(n - 2).add(getN(n - 1));
        }
    }

    private void valideN(int n) {
        if (n < 0) {
            throw new ArgumentLessThanZeroException("Argument must not be less than 0!");
        }
    }
}
