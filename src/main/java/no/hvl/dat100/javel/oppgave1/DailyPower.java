package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for (double teller : prices) {
            System.out.printf("%.2f NOK ",teller);
        }
        System.out.printf("%n");
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {
        for (double teller : usage) {
            System.out.printf("%.2f kWh ", teller);
        }
        System.out.printf("%n");
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for (double index : usage) {
            sum += index;
        }

        System.out.printf("%.2f kW totalt%n", sum);
        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;
        int index = 0;
        for (double teller : usage) {
            price += (teller * prices[index]);
            index++;
        }

        System.out.printf("%.2f NOK%n", price);
        return price;
    }

    // e) compute power support for a given usage and price
    private static double getSupport(double usage, double price) {
        final double THRESHOLD = 0.9375;
        final double COVERAGE = 0.90;

        if (price <= THRESHOLD) {
            return 0;
        }
        double støtte = (price - THRESHOLD) * COVERAGE * usage;
        return støtte;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double totalStøtte = 0;
        for(int i = 0; i < usage.length; i++){
            double støtte = getSupport(usage[i], prices[i]);
            totalStøtte += støtte;
        }
        System.out.printf("Totale støtten du får er %.2f kr%n", totalStøtte);
        return totalStøtte;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for(int i = 0; i < usage.length; i++){
            price += usage[i] * 0.5;
        }
        System.out.printf("Totalpris for strømbruken for NorgesPrice er %.2f kr%n", price);
        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for(int i = 0; i < usage.length; i++){
            if(usage[i] > temp_max){
                temp_max = usage[i];
            }
        }
        System.out.println("Timen du brukte mest strøm ble " + temp_max + "kwh brukt");
        return temp_max;
    }
    // i) findAvgPower
    public static double findAvgPower(double[] usage) {

        double average = 0;
        double strømBruk = 0;
        for(int i = 0; i < usage.length; i++){
            strømBruk += usage[i];
        }
        average = strømBruk / usage.length;
        System.out.printf("Den gjennomsnittelige strømbruken var %.2fkr%n", average);
        return average;
    }
}
