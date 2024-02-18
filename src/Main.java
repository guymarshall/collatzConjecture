import java.math.BigInteger;

public class Main
{
    public static void main(String[] args)
    {
        final BigInteger start = BigInteger.valueOf(1);
        final BigInteger finish = BigInteger.valueOf(1000000);
        BigInteger number = start;
        BigInteger highestSteps = BigInteger.ZERO;

        while (number.compareTo(finish) <= 0)
        {
            BigInteger steps = Collatz.collatz(number);

            if (steps.compareTo(highestSteps) > 0)
            {
                highestSteps = new BigInteger(steps.toString());
                System.out.printf("Number: %d, Steps: %d%n", number, highestSteps);
            }
            number = number.add(BigInteger.ONE);
        }
    }
}