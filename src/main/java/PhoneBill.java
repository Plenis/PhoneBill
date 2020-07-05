public class PhoneBill{

    double total;
    double callCost;
    double smsCost;
    double dataCost;

    public double accept(BillAction billAction){
        if(billAction.equals(smsCost)){
            smsCost += total;
        }
        else if(billAction.equals(dataCost)){
            dataCost += total;
        }
        else if(billAction.equals(callCost)){
            callCost +=total;
        }
        return total;
    }

    
//    public double total(){
//        return total;
//    }

    public static void main(String[] args) {
        PhoneBill phoneBill = new PhoneBill();
        BillAction phoneCall = new PhoneCall(40);
        BillAction smsing = new SMSBundle(2, 4);
        BillAction streaming = new DataBundle(450);

        phoneBill.accept(phoneCall);
        phoneBill.accept(smsing);
        phoneBill.accept(streaming);

        System.out.println("phonecall: "+phoneCall.totalCost());
        System.out.println("sms: "+smsing.totalCost());
        System.out.println("data: "+streaming.totalCost());
//        System.out.println(phoneBill.total(smsing));

    }

}
