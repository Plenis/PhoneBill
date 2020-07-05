public class PhoneCall implements BillAction{

    private  double callPrice;

    public PhoneCall(double call){
        this.callPrice = call;
    }
    @Override
    public double totalCost() {
        return callPrice;
    }
}
