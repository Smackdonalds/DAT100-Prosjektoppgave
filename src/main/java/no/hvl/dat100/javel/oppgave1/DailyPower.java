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
