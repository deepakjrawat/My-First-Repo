package Package1.Concepts;

/**
 * Created by DRawat on 11/6/2016.
 */
public class Demo {


    public static void main(String args[])
    {
        Students s1 = new Students();
        s1.setStudentId(1001);
        s1.setQualifyingExamMarks(95.0f);
        s1.setResidentialStatus('D');
        s1.setYearofEngg(2);

        //to display details
        System.out.println("====================================== ");
        System.out.println("StudentId           : " + s1.getStudentId());
        System.out.println("QualifyingExamMarks : " + s1.getQualifyingExamMarks() );
        System.out.println("ResidentialStatus   : " + s1.getResidentialStatus());
        System.out.println(" YearofEngg         : " + s1.getYearofEngg());
        System.out.println("====================================== ");
    }
}
