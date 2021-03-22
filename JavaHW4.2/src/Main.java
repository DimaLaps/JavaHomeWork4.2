public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 1.99;
        double growth = 99.9;
        double bodyMassIndex = service.calculate(growth, weight);
                System.out.println(bodyMassIndex);
    }
}