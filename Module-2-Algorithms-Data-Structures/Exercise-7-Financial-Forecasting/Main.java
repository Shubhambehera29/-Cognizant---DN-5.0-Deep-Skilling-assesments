public class Main {

    public static void main(String[] args) {

        double presentValue = 10000;   // Initial investment
        double growthRate = 0.10;      // 10% annual growth
        int years = 5;

        double futureValue = FinancialForecast.predictFutureValue(
                presentValue,
                growthRate,
                years
        );

        System.out.printf("Present Value : %.2f%n", presentValue);
        System.out.printf("Growth Rate   : %.2f%%%n", growthRate * 100);
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : %.2f%n", futureValue);
    }

    static class FinancialForecast {
        static double predictFutureValue(double presentValue, double growthRate, int years) {
            return presentValue * Math.pow(1 + growthRate, years);
        }
    }
}