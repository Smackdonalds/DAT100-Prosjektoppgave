package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // Test data fra DayPowerData.java
        double[] powerusage_day = DayPowerData.powerusage_day;
        double[] powerprices_day = DayPowerData.powerprices_day;

        // Oppgave 1
        System.out.printf("==============%nOPPGAVE 1%n==============%n");

        // a) Skriver ut formeterte strømpriser
        DailyPower.printPowerPrices(powerprices_day);

        // b) Skriver ut formetert strømforbruk
        DailyPower.printPowerUsage(powerusage_day);

        // c) Regner ut totalt strømforbruk for en dag
        System.out.printf("%.2f kW totalt%n",DailyPower.computePowerUsage(powerusage_day));

        // d) Regner ut strømkostnadd for hele dagen
        DailyPower.computeSpotPrice(powerusage_day, powerprices_day);

        // e) Regner ut strømpris med strømstøtte
    }
}
