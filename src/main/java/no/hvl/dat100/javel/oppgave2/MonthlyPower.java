package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        for (double[] index : usage) {
            for (double i : index) {
                System.out.printf("%.2f kW ",i);
            }
        }
        System.out.printf("%n");
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for (double[] index : prices) {
            for (double i : index) {
                System.out.printf("%.2f NOK ",i);
            }
        }
        System.out.printf("%n");
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (double[] index : usage) {
            for (double i : index) {
                sum += i;
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int arrayLength = 0;

        for(double[] test : powerusage) {
            arrayLength++;
        }

        int index=0;
        while (usage < threshold && index < arrayLength) {
            usage +=DailyPower.computePowerUsage(powerusage[index]);
            if (usage > threshold) {
                exceeded = true;
            }
            index++;
        }
        System.out.print("Gikk over grensen: " + exceeded + "\n");
        return exceeded;
    }
    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price += usage[i][j] * prices[i][j];
            }
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {
    
        final double THRESHOLD = 0.9375;
        final double COVERAGE = 0.90;

        double support = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                if (prices[i][j] > THRESHOLD) {
                    support += (prices[i][j] - THRESHOLD) * COVERAGE * usage[i][j];
                }
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        final double NORGESPRIS_KWH = 0.5;

        double price = 0;

        for (double[] day : usage) {
            for (double hour : day) {
                price += hour * NORGESPRIS_KWH;
            }
        }

        return price;
    }
}
