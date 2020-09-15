public class CreditPaymentService {
    public double calculait (double amount, int time, int percent) {
        double totalmouns = amount / time + (amount/100.0*(percent/12.0/100.0));
        return totalmouns;
    }
}
