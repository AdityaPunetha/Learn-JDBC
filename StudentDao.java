import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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

    public static void showAllStudents() {
        try {
            Connection con = CP.CreateC();
            String q = "select * from students";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            System.out.println("------------------------------------------------");
            while (set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString("scity");
                System.out.println("ID : " + id);
                System.out.println("name : " + name);
                System.out.println("phone : " + phone);
                System.out.println("city : " + city);
                System.out.println("------------------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
