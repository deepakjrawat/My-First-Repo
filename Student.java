package Package1.Concepts;

/**
 * Created by DRawat on 11/6/2016.
 */
public class Student {
    int StudentId;
    char StudentType;

    public void setStudentId(int SId) {
        this.StudentId = SId;
    }

    public int getStudentId() {
        return this.StudentId;
    }

    public void SetStudentType(char Stype) {
        this.StudentType = Stype;
    }

    public char GetStudentType() {
        return this.StudentType;
    }
}