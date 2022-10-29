public class TravelTime {
    public static void main(String[] args) {
        int distance = 55;
        double averageSpeed = 50.6;
        double time = distance / averageSpeed;
        double theCoefficientOfDelay = 0.88;
        double eveningTime = time / theCoefficientOfDelay;
        System.out.println("Тестировщик добирается до дома вечером за " + eveningTime + " часа");
    }
}
