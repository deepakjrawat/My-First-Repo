package Package1.Concepts;

/**
 * Created by DRawat on 11/9/2016.
 */
public class Registration {
    int registrationid;
    double fees;

    public void setRegistrationid(int registrationid) {
        this.registrationid = registrationid;
    }

    public int getRegistrationid() {
        return registrationid;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getFees() {
        return fees;
    }
public void  calculateFees(int marks)
    {
        int discount = 0;
        if(marks >= 85 && marks<=100)
        {
            discount = 12;
        }
        else if (marks >=75 && marks<=84)
        {
            discount = 7;
        }
        else if ( marks>=65 && marks<=74)
        {
            discount =0;
        }

        fees = fees - ( fees * (discount/100));
    }
}
