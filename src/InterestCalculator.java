public class InterestCalculator {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principalAmount, double interestRate, double timePeriod) {
        return (principalAmount * interestRate * timePeriod) / 100;
    }

    // Overloaded method for calculating simple interest with a default time period
    // of 1 year
    public static double calculateSimpleInterest(double principalAmount, double interestRate) {
        double defaultTimePeriod = 1;
        return calculateSimpleInterest(principalAmount, interestRate, defaultTimePeriod);
    }

    // Method to calculate compound interest
    public static double calculateCompoundInterest(double principalAmount, double interestRate, double timePeriod,
            double frequencyOfCompounding) {
        double compoundInterest = principalAmount
                * (Math.pow(1 + interestRate / frequencyOfCompounding, frequencyOfCompounding * timePeriod))
                - principalAmount;
        return compoundInterest;
    }

    // Main method to demonstrate usage of each method
    public static void main(String[] args) {
        double principal = 1000; // principal amount
        double rate = 5; // interest rate
        double time = 2; // time period
        double frequency = 4; // frequency of compounding

        // Calculating and displaying simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);

        // Demonstrating overloaded simple interest calculation
        double simpleInterestDefaultTime = calculateSimpleInterest(principal, rate);
        System.out.println("Simple Interest with Default Time Period: " + simpleInterestDefaultTime);

        // Calculating and displaying compound interest
        double compoundInterest = calculateCompoundInterest(principal, rate, time, frequency);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
