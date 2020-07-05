import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBillTest {
    @Test
    public void shouldMakePhoneCall(){
        PhoneBill phoneBill = new PhoneBill();
        PhoneCall phoneCall = new PhoneCall(5.66);

        phoneBill.accept(phoneCall);
        assertEquals(5.66, phoneCall.totalCost());
    }

    @Test
    public void shouldMakeSMS(){
        PhoneBill phoneBill = new PhoneBill();
        SMSBundle smsBundle = new SMSBundle(2, 4);

        phoneBill.accept(smsBundle);
        assertEquals(4, smsBundle.totalCost());
    }

    @Test
    public void shouldUseDataBundleLessThan500mb(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(400);

        phoneBill.accept(dataBundle);
        assertEquals(0.75, dataBundle.totalCost());
    }

    @Test
    public void shouldUseDataBundleMoreThan500mb(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(600);

        phoneBill.accept(dataBundle);
        assertEquals(0.55, dataBundle.totalCost());
    }

    @Test
    public void shouldUseDataBundleLessThan100mb(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(12);

        phoneBill.accept(dataBundle);
        assertEquals(0.35, dataBundle.totalCost());
    }


    @Test
    public void shouldGiveTotalBill(){
        PhoneBill phoneBill = new PhoneBill();
        BillAction call = new PhoneCall(2.45);
        BillAction anotherCall = new PhoneCall(20.45);
        BillAction sms = new SMSBundle(2, 4);
        BillAction data = new DataBundle(450);

        phoneBill.accept(call);
        phoneBill.accept(anotherCall);
        phoneBill.accept(sms);
        phoneBill.accept(data);

        assertEquals(27.65 ,phoneBill.total());
    }
}