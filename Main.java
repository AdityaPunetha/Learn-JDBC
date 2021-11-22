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
        sc.close();
        Student stu = new Student(name, phone, city);
        System.out.println(stu);
    }
}
