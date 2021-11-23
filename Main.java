import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Username: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter city: ");
        String city = sc.nextLine();
        Student stu = new Student(name, phone, city);
        boolean answer = StudentDao.insertStudentToDB(stu);
        if (answer) {
            System.out.println("added");
        } else {
            System.out.println("err");
        }
        System.out.println(stu);
        System.out.print("Enter id to del: ");
        int userID = sc.nextInt();
        sc.close();

        StudentDao.deleteStudent(userID);

    }
}
