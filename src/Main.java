import java.math.BigInteger;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        final BigInteger start = BigInteger.valueOf(1);
        final BigInteger finish = BigInteger.valueOf(1000000);
        BigInteger number = start;

        HashMap<BigInteger, BigInteger> steps = new HashMap<>();

        while (number.compareTo(finish) < 0)
        {
            System.out.printf("Number: %d, Steps: %d%n", number, Collatz.collatz(number, steps));
            number = number.add(BigInteger.ONE);
        }
    }
}