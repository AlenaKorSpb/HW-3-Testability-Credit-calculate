public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        double totalMounth12 = creditPaymentService.calculait(1000000.0, 12, (float) 9.99);
        System.out.println(totalMounth12);

        double totalMounth24 = creditPaymentService.calculait(1000000.0, 24, (float) 9.99);
        System.out.println(totalMounth24);

        double totalMounth36 = creditPaymentService.calculait(1000000.0, 36, (float) 9.99);
        System.out.println(totalMounth36);
    }
}
