import java.math.BigInteger;
import java.util.HashMap;

public class Collatz {
    public final static BigInteger THREE = BigInteger.valueOf(3);
    public static BigInteger collatz(BigInteger number, HashMap<BigInteger, BigInteger> steps)
    {
        BigInteger counter = BigInteger.ZERO;

        // if even, divide by 2
        // else times by 3 and add 1
        while (number.compareTo(BigInteger.ONE) > 0)
        {
            counter = counter.add(BigInteger.ONE);

            if (steps.containsKey(number))
            {
                return steps.get(number).add(counter);
            }

            if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO))
            {
                number = number.divide(BigInteger.TWO);
            }
            else
            {
                number = ((THREE.multiply(number)).add(BigInteger.ONE)).divide(BigInteger.TWO);
            }
        }

        steps.put(number, counter);

        return counter;
    }
}