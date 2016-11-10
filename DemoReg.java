package Package1.Concepts;

/**
 * Created by DRawat on 11/9/2016.
 */
public class DemoReg {
    public static void main(String args[])
    {
        int branchid = 1002;
        Registration reg = new Registration();
        reg.setRegistrationid(2001);

        if(branchid ==1001) reg.setFees(25575.0d);
        else if(branchid ==1002) reg.setFees(15500.0d);
        else if(branchid ==1003) reg.setFees(33750.0d);
        else if(branchid ==1004) reg.setFees(8350.0d);
        else if(branchid ==1005) reg.setFees(20500.0d);

       reg.calculateFees(79);
        System.out.println("Registration Id :" + reg.getRegistrationid() );
        System.out.println("Fees            :" + reg.getFees() );
    }
}
