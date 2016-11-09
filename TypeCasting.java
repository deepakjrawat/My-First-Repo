package Package1.Concepts;

/**
 * Created by DRawat on 11/6/2016.
 */
public class TypeCasting {
    double billAmount;
    double discount;

    public double AfterDiscount()
    {
        billAmount = billAmount - (billAmount * ((double)discount/100.0));
        return  billAmount;
    }

    public static void main(String args[]){
        TypeCasting bamt = new TypeCasting();
        bamt.billAmount = 50000;
        bamt.discount = 10;

       double v =  bamt.AfterDiscount();

        System.out.println("the discounted amount is " + v);

    }
}
