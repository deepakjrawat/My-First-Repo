package Package1.Concepts;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by DRawat on 11/6/2016.
 */
public class Checks {
    boolean checkBaggage(Traveller traveller) {
        if (traveller.baggageAmount >= 0 || traveller.baggageAmount <= 40)
            return TRUE;
        else
            return FALSE;
    }

    boolean CheckImmigration(Traveller traveller) {
        if (traveller.expiryYear >= 2001 || traveller.expiryYear <= 2025)
            return TRUE;
        else
            return FALSE;

    }

    boolean checkSecurity(Traveller traveller) {
        if (traveller.isNocStatus() == TRUE) return TRUE;
        else
            return FALSE;
    }

}
