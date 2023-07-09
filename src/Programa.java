public class Programa {
    public static void main(String[] args) {

        PayService payService = new PayService(new PEDeductionService());
        double tax = payService.tax(1000);
        System.out.println(tax);

        PayService payService2 = new PayService(new RNDeductionService());
        double tax2 = payService2.tax(1000);
        System.out.println(tax2);

    }
}