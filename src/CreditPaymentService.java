public class CreditPaymentService {
    public double calculate(int amount, int period, double interestRate) {
        double percentPerMonth = interestRate / (100 * 12);
        double bracket = (1 + percentPerMonth);
        double period1 = period;
        double exponent;
        exponent = Math.pow(bracket, -period1);
        double monthlyPayment = amount * percentPerMonth / (1 - exponent);
        return monthlyPayment;
    }
}
