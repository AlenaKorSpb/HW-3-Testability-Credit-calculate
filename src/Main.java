public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        double totalmouns12 = creditPaymentService .calculait(1000000, 12, (int) 9.99);
        System.out.println(totalmouns12);

        double totalmouns24 = creditPaymentService .calculait(1000000, 24, (int) 9.99);
        System.out.println(totalmouns24);

        double totalmouns36 = creditPaymentService .calculait(1000000, 36, (int) 9.99);
        System.out.println(totalmouns36);
    }
}
