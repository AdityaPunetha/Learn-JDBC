import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
    public static boolean insertStudentToDB(Student stu) {
        boolean f = false;
        try {
            Connection con = CP.CreateC();
            String q = "insert into students(sname,sphone,scity) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, stu.getStudentName());
            pstmt.setString(2, stu.getStudentPhone());
            pstmt.setString(3, stu.getStudentCity());
            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userID) {
        boolean f = false;
        try {
            Connection con = CP.CreateC();
            String q = "delete from students where sid = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, userID);
            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
