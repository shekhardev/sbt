package interfacedefault;

import java.time.LocalTime;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

interface Phone{
    void call();
    default void message(){
        System.out.println("message sent..");
    }
    default void newDate(){
        System.out.println(LocalTime.now());
    }
}
class AndroidPhone implements Phone{

    @Override
    public void call() {
        System.out.println("Calling...");
    }
}

public class InterfaceDefault {
    public static void main(String[] args) throws ParseException {
        Phone phone = new AndroidPhone();
        phone.call();
        phone.message();
        phone.newDate();

        Date today = new Date();
        Date myDate = new Date(today.getYear(),today.getMonth()-1,today.getDay());
        System.out.println("My Date is "+myDate);
        System.out.println("Today Date is"+today);
        if (today.compareTo(myDate)<0)
            System.out.println("Today Date is Lesser than my Date");
        else if (today.compareTo(myDate)>0)
            System.out.println("Today Date is Greater than my date");
        else
            System.out.println("Both Dates are equal");
    }
}
