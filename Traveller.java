package Package1.Concepts;

/**
 * Created by DRawat on 11/6/2016.
 */
public class Traveller {
    int travellerId;
    int baggageAmount;
    int expiryYear;
    boolean nocStatus;

    public int getTravellerId() {
        return travellerId;
    }

    public void setTravellerId(int travellerId) {
        this.travellerId = travellerId;
    }

    public void setBaggageAmount(int baggageAmount) {
        this.baggageAmount = baggageAmount;
    }

    public int getBaggageAmount() {
        return baggageAmount;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public void setNocStatus(boolean nocStatus) {
        this.nocStatus = nocStatus;
    }

    public boolean isNocStatus() {
        return nocStatus;
    }

}
