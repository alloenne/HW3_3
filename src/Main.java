import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        DecimalFormat dF = new DecimalFormat("###,###");
        double yourPayment = service.calculate(1_000_000, 1);
        int yourFinPayment = (int) yourPayment;
        System.out.println("При сумме кредита 1 000 000 сроком на 1 год, ваш платеж составит " + dF.format(yourFinPayment) + " рублей в месяц.");

        yourPayment = service.calculate(1_000_000, 2);
        yourFinPayment = (int) yourPayment;
        System.out.println("При сумме кредита 1 000 000 сроком на 2 года, ваш платеж составит " + dF.format(yourFinPayment) + " рублей в месяц.");

        yourPayment = service.calculate(1_000_000, 3);
        yourFinPayment = (int) yourPayment;
        System.out.println("При сумме кредита 1 000 000 сроком на 3 года, ваш платеж составит " + dF.format(yourFinPayment) + " рублей в месяц.");
    }
}