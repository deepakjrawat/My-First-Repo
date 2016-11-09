package Package1.Concepts;

/**
 * Created by DRawat on 11/6/2016.
 */
public class PassByVal {
    public static void main (String args[]) {
        int sId = 26 ;
        PassByVal val = new PassByVal();
        System.out.println(sId);
        val.passTheValueMethod(sId);
        System.out.println( "The sId are" + sId);
    }
    public void passTheValueMethod ( int sId) {
        Students s1 = new Students();
       double sd = s1.setStudentId(20);
        /* sId = 10 ; */
        System.out.println( "The sId are" + sd);
    }
}
