public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1000000,36, 9.99);
        String str = String.format("Ваш ежемесячный платеж - %.2f. ", payment);
        System.out.println(str);
    }

}
