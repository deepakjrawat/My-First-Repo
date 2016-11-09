package Package1.Concepts;

import static java.lang.Boolean.TRUE;

/**
 * Created by DRawat on 11/6/2016.
 */
public class Demos {
    public static void main(String args[]) {

        Traveller ts = new Traveller();
        ts.setTravellerId(1001);
        ts.setBaggageAmount(35);
        ts.setExpiryYear(2019);
        ts.setNocStatus(true);

        Checks ck = new Checks();


        if(ck.checkBaggage(ts)== TRUE && ck.CheckImmigration(ts) == TRUE && ck.checkSecurity(ts) ==TRUE)
        {
            System.out.print("Allow Traveller to fly!");
        }
        else
            {
            System.out.print("Detain Traveller for Re-checking!");
        }

        Students s1 = new Students();
        if(s1.validateExamMark()== TRUE)
        {
            System.out.println("valid marks.");
        }
        else
        {
         System.out.println("Invalid marks, the range of the qualifying exam marks is between 65\n" +
                 "and 100");
        }

    }

}
