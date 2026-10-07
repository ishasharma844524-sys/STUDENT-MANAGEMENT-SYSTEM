import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Course: " + course);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("--- Student Management System ---");
        do {
            System.out.println("\n1. Add Student\n2. Display All\n3. Search by ID\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter ID: "); int id = sc.nextInt(); sc.nextLine();
                System.out.print("Enter Name: "); String name = sc.nextLine();
                System.out.print("Enter Course: "); String course = sc.nextLine();
                students.add(new Student(id, name, course));
                System.out.println("Student Added!");
            } else if (choice == 2) {
                if (students.isEmpty()) System.out.println("No data!");
                else for (Student s : students) s.display();
            } else if (choice == 3) {
                System.out.print("Enter ID: "); int sid = sc.nextInt();
                boolean found = false;
                for (Student s : students) if (s.id == sid) { s.display(); found = true; }
                if (!found) System.out.println("Not Found!");
            }
        } while (choice != 4);
        sc.close();
    }
}