package Package1.Concepts;

/**
 * Created by DRawat on 11/6/2016.
 */
class VariablesDemo {
     char Gender ='M';
     float Allowances = 100f;
     double BasicSalary = 25000.0;
    final int age = 21;


    public static void main(String args[])
    {
        VariablesDemo v1 = new VariablesDemo();
        System.out.println("The gender is " + v1.Gender );
    };
}
