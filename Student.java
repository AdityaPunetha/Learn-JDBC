
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

    /**
     * @return int return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return String return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return String return the studentCity
     */
    public String getStudentCity() {
        return studentCity;
    }

    /**
     * @param studentCity the studentCity to set
     */
    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    /**
     * @return String return the studentPhone
     */
    public String getStudentPhone() {
        return studentPhone;
    }

    /**
     * @param studentPhone the studentPhone to set
     */
    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

}
