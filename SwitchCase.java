package Package1.Concepts;

/**
 * Created by DRawat on 11/9/2016.
 */
public class SwitchCase {

    public static void main(String args[])
    {
        char grade ='B';
        String rangeMarks;

        switch (grade){
            case 'A':
                rangeMarks =" Range of Marks: 80 -100." ;
                break;
            case 'B':
                rangeMarks =" Range of Marks: 73-79." ;
                break;
            case 'C':
                rangeMarks =" Range of Marks: 65 -72." ;
                break;
            case 'D':
                rangeMarks =" Range of Marks: 55 -64." ;
                break;
            case 'E':
                rangeMarks =" Range of Marks: <55." ;
                break;
            default:
                rangeMarks ="Grade does not exist";

        }
        System.out.println(rangeMarks);
    }
}
