public class SMSBundle implements BillAction{

    private int qty;
    private double smsPrice;

    public SMSBundle(int qty, double smsPrice){
        this.qty = qty;
        this.smsPrice = smsPrice;
    }
    @Override
    public double totalCost() {
        return smsPrice;
    }
}
