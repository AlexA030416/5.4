public class Main {
    public static void main(String[] args) {
        System.out.println("Miles\tKilometers");
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.printf("%-7d%10.3f%n", miles, kilometers);
        }
    }
}
