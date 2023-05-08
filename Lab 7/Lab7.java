import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Lab7 {

    public static void main(String[] args) {

        List<Double> sepalLengthValues = new ArrayList<>();
        List<Double> sepalWidthValues = new ArrayList<>();
        List<Double> petalLengthValues = new ArrayList<>();
        List<Double> petalWidthValues = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Iris.csv"))) {
            String line;
            boolean header = true;
            while ((line = br.readLine()) != null) {
                if (header) {
                    header = false;
                    continue;
                }
                String[] values = line.split(",");
                double sepalLength = Double.parseDouble(values[1]);
                double sepalWidth = Double.parseDouble(values[2]);
                double petalLength = Double.parseDouble(values[3]);
                double petalWidth = Double.parseDouble(values[4]);
                sepalLengthValues.add(sepalLength);
                sepalWidthValues.add(sepalWidth);
                petalLengthValues.add(petalLength);
                petalWidthValues.add(petalWidth);
            }
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", "Iris.csv");
            e.printStackTrace();
            return;
        }

        double[] sepalLengthStats = calculateFivePointSummary(sepalLengthValues);
        double[] sepalWidthStats = calculateFivePointSummary(sepalWidthValues);
        double[] petalLengthStats = calculateFivePointSummary(petalLengthValues);
        double[] petalWidthStats = calculateFivePointSummary(petalWidthValues);

        System.out.println("Five-point summary for SepalLengthCm:");
        System.out.println("Mean: " + sepalLengthStats[0]);
        System.out.println("Median: " + sepalLengthStats[1]);
        System.out.println("Mode: " + sepalLengthStats[2]);
        System.out.println("Minimum: " + sepalLengthStats[3]);
        System.out.println("Maximum: " + sepalLengthStats[4]);

        System.out.println("\nFive-point summary for SepalWidthCm:");
        System.out.println("Mean: " + sepalWidthStats[0]);
        System.out.println("Median: " + sepalWidthStats[1]);
        System.out.println("Mode: " + sepalWidthStats[2]);
        System.out.println("Minimum: " + sepalWidthStats[3]);
        System.out.println("Maximum: " + sepalWidthStats[4]);

        System.out.println("\nFive-point summary for PetalLengthCm:");
        System.out.println("Mean: " + petalLengthStats[0]);
        System.out.println("Median: " + petalLengthStats[1]);
        System.out.println("Mode: " + petalLengthStats[2]);
        System.out.println("Minimum: " + petalLengthStats[3]);
        System.out.println("Maximum: " + petalLengthStats[4]);

        System.out.println("\nFive-point summary for PetalLengthCm:");
        System.out.println("Mean: " + petalWidthStats[0]);
        System.out.println("Median: " + petalWidthStats[1]);
        System.out.println("Mode: " + petalWidthStats[2]);
        System.out.println("Minimum: " + petalWidthStats[3]);
        System.out.println("Maximum: " + petalWidthStats[4]);
    }

    private static double[] calculateFivePointSummary(List<Double> sepalLengthValues) {
        return null;
    }
}
