import java.math.BigInteger;

public class Collatz {
    public final static BigInteger THREE = BigInteger.valueOf(3);
    public static BigInteger collatz(BigInteger number)
    {
        BigInteger counter = BigInteger.ZERO;

        // if even, divide by 2
        // else times by 3 and add 1
        while (number.compareTo(BigInteger.ONE) > 0)
        {
            counter = counter.add(BigInteger.ONE);

            if (!number.testBit(0))
            {
                number = number.divide(BigInteger.TWO);
            }
            else
            {
                number = ((THREE.multiply(number)).add(BigInteger.ONE)).divide(BigInteger.TWO);
            }
        }

        return counter;
    }
}