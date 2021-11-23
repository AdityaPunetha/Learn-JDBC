import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 to ADD");
            System.out.println("2 to DEL");
            System.out.println("3 to SHOW");
            System.out.println("4 to EXIT");
            boolean answer;
            int c = sc.nextInt();
            sc.nextLine();
            if (c == 1) {
                System.out.print("Enter Username: ");
                String name = sc.nextLine();
                System.out.print("Enter phone: ");
                String phone = sc.nextLine();
                System.out.print("Enter city: ");
                String city = sc.nextLine();
                Student stu = new Student(name, phone, city);
                answer = StudentDao.insertStudentToDB(stu);
                if (answer) {
                    System.out.println("added");
                } else {
                    System.out.println("err");
                }
                System.out.println(stu);
            } else if (c == 2) {
                System.out.print("Enter id to del: ");
                int userID = sc.nextInt();
                answer = StudentDao.deleteStudent(userID);
                if (answer) {
                    System.out.println("deleted");
                } else {
                    System.out.println("err");
                }
            } else if (c == 3) {
                StudentDao.showAllStudents();
            } else if (c == 4) {
                break;
            } else {
            }
        }
        sc.close();

    }
}
