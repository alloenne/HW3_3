public class CreditPaymentService {
    public double calculate(double amount, double term) {
        double percent = 9.99;
        if (amount < 100_000) {
            amount = 100_000;
        }
        if (amount > 5_000_000) {
            amount = 5_000_000;
        }
        if (term < 1) {
            term = 1;
        }
        if (term > 3) {
            term = 3;
        }
        double payment = (amount * percent / (12 * 100)) / (1 - Math.pow((1 + percent / (12 * 100)), -term * 12));
        return payment;

    }
}
