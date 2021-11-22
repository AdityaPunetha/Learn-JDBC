
public class Student {
    private int studentId;
    private String studentName;
    private String studentCity;
    private String studentPhone;

    public Student(int studentId, String studentName, String studentCity, String studentPhone) {
        super();
        this.studentId = studentId;
        this.studentCity = studentCity;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
    }

    public Student(String studentName, String studentCity, String studentPhone) {
        super();
        this.studentCity = studentCity;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
    }

    public Student() {
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    @Override
    public String toString() {
        return "{" + " studentId='" + getStudentId() + "'" + ", studentName='" + getStudentName() + "'"
                + ", studentCity='" + getStudentCity() + "'" + ", studentPhone='" + getStudentPhone() + "'" + "}";
    }

}
