import java.math.BigInteger;

public class Main
{
    public static void main(String[] args)
    {
        final BigInteger start = BigInteger.valueOf(1);
        final BigInteger finish = BigInteger.valueOf(1000000);
        BigInteger number = start;

        while (number.compareTo(finish) <= 0)
        {
            System.out.printf("Number: %d, Steps: %d%n", number, Collatz.collatz(number));
            number = number.add(BigInteger.ONE);
        }
    }
}