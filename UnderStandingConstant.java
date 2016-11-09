package Package1.Concepts;

/**
 * Created by DRawat on 11/6/2016.
 */
class UnderStandingConstant {
    public char Gender ='M';
    public float Allowances = 100f;
    public double BasicSalary = 25000.0;
    final int age = 21;


    public static void main(String args[])
    {
        UnderStandingConstant v1 = new UnderStandingConstant();
        //v1.age =34;
        System.out.println("The gender is " + v1.Gender );
    };
}
