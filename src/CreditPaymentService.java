public class CreditPaymentService {
    public double calculait(double amountCredit, int timeMounth, float percentYear) {
        double percentMounth = percentYear / 12 / 100;
        double k = (percentMounth * Math.pow((1 + percentMounth), timeMounth)) / (Math.pow(1 + percentMounth, timeMounth) - 1);
        double paymentMounth = k * amountCredit;

        return paymentMounth;

    }
}



