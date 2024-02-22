import java.math.BigInteger;

public class Main
{
    public static void main(String[] args)
    {
        BigInteger number = BigInteger.valueOf(1);
        BigInteger highestSteps = BigInteger.ZERO;

        BigInteger[] result = FileUtilities.readLastValues("collatz_data.csv");

        if (result[0] != null && result[1] != null)
        {
            if (result[0].compareTo(number) > 0)
            {
                number = result[0];
            }

            if (result[1].compareTo(highestSteps) > 0)
            {
                highestSteps = result[1];
            }
        }

        while (true)
        {
            BigInteger steps = Collatz.collatz(number);

            if (steps.compareTo(highestSteps) > 0)
            {
                highestSteps = new BigInteger(steps.toString());
                System.out.printf("Number: %,d, Steps: %,d%n", number, highestSteps);
                FileUtilities.writeToFile("collatz_data.csv", number, highestSteps);
            }
            number = number.add(BigInteger.TWO);
        }
    }
}