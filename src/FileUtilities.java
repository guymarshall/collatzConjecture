import java.io.*;
import java.math.BigInteger;

public class FileUtilities
{
    public static void writeToFile(String fileName, BigInteger number, BigInteger highestSteps)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)))
        {
            writer.write(String.format("%s,%s%n", number, highestSteps));
        }
        catch (IOException e)
        {
            System.out.printf("Failed to write file: %s%n", e.getMessage());
            System.exit(1);
        }
    }

    public static BigInteger[] readLastValues(String fileName)
    {
        BigInteger[] result = new BigInteger[2];
        File file = new File(fileName);

        if (file.exists() && file.length() > 0)
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
            {
                String line;
                while ((line = reader.readLine()) != null)
                {
                    String[] values = line.split(",");
                    if (values.length == 2)
                    {
                        result[0] = new BigInteger(values[0].trim());
                        result[1] = new BigInteger(values[1].trim());
                    }
                }
            }
            catch (IOException e)
            {
                System.out.printf("Failed to read file: %s%n", e.getMessage());
                System.exit(1);
            }
        }

        return result;
    }
}
