public class PhoneBill{

    double total;

    public void accept(BillAction billAction){
        total += billAction.totalCost();
    }

    public double total(){
        return Math.round(total);
    }


    public static void main(String[] args) {
        PhoneBill phoneBill = new PhoneBill();
        BillAction phoneCall = new PhoneCall(40);
        BillAction texting = new SMSBundle(2, 4);
        BillAction streaming = new DataBundle(450);

        phoneBill.accept(phoneCall);
        phoneBill.accept(texting);
        phoneBill.accept(streaming);

        System.out.println("phonecall: R"+phoneCall.totalCost());
        System.out.println("sms: R"+texting.totalCost());
        System.out.println("data: R"+streaming.totalCost());
        System.out.println("total bill: R"+phoneBill.total());

    }

}
