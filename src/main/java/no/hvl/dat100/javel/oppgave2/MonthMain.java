package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

import java.time.Month;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // Test data fra MothPowerData.java
        double[][] power_prices_month = MonthPowerData.powerprices_month;
        double[][] power_usage_month = MonthPowerData.powerusage_month;

        // Oppgave 1
        System.out.printf("==============%nOPPGAVE 2%n==============%n");

        // a) Skriver ut månedlig strømforbruk
        MonthlyPower.print_PowerUsage(power_usage_month);

        // b) Skriver ut månedlig strømpriser
        MonthlyPower.print_PowerPrices(power_prices_month);

        // c) Regner ut totalt strøm forbruk for måneden
        System.out.printf("%.2f kW%n",MonthlyPower.computePowerUsage(power_usage_month));

        // d) Sjekker om strømforbruk treffer øvre grense for NorgePris ved 1000 kWh
        MonthlyPower.exceedThreshold(power_usage_month,1000);

        // e)
        System.out.printf("%.2f NOK %n",MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));

        // f) Regner ut strømstøtte for måneden
        System.out.printf("%.2f NOK %n",MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));

        // g) Regner ut Norgespris for måneden
        System.out.printf("%.2f NOK %n",MonthlyPower.computeNorgesPrice(power_usage_month));

    }
}
