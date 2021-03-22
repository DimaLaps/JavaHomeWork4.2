public class BmiService {
    public double calculate(double weight, double growth) {
        double bodyMassIndex = weight / (growth * growth);
        return bodyMassIndex;
    }
}