package Package1.Concepts;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by DRawat on 11/6/2016.
 */
public class Students {
    int studentId;
    float qualifyingExamMarks;
    char residentialStatus;
    int yearofEngg;
    boolean examMarks;


    public int getStudentId() {
        return studentId;
    }

    public double setStudentId(int studentId) {
        this.studentId = studentId;
        return 0;
    }

    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }

    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }

    public char getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public void setYearofEngg(int yearofEngg) {
        this.yearofEngg = yearofEngg;
    }

    public int getYearofEngg() {
        return yearofEngg;
    }

    public boolean validateExamMark() {
        if (getQualifyingExamMarks() >= 65 && getQualifyingExamMarks() <= 100) {
            return TRUE;
        } else {
            return FALSE;
        }
    }
}
