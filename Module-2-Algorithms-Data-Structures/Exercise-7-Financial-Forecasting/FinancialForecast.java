
public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double presentValue,
                                            double growthRate,
                                            int years) {

        // Base Case
        if (years == 0) {
            return presentValue;
        }

        // Recursive Case
        return predictFutureValue(
                presentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }

}