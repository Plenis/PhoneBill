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
        BillAction phoneCall = new PhoneCall(5);
        BillAction texting = new SMSBundle(1, 2);
        BillAction streaming = new DataBundle(200);

        phoneBill.accept(phoneCall);
        phoneBill.accept(phoneCall);
        phoneBill.accept(phoneCall);
        phoneBill.accept(texting);
        phoneBill.accept(texting);
        phoneBill.accept(streaming);
        phoneBill.accept(streaming);

        System.out.println("phonecall: R"+phoneCall.totalCost());
        System.out.println("sms: R"+texting.totalCost());
        System.out.println("data: R"+streaming.totalCost());
        System.out.println("total bill: R"+phoneBill.total());

    }

}
