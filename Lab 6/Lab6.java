import java.util.Scanner;

class Student {
    private String regNo;
    private String name;
    private String email;
    private String phone;

    public Student(String regNo2, String name, String email2, String phone2) {
        this.regNo = regNo2;
        this.name = name;
        this.email = email2;
        this.phone = phone2;
    }

    public void printDetails() {
        System.out.println("Reg. No.: " + this.regNo);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
    }

    public Object getRegNo() {
        return null;
    }

    public Object getName() {
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Student[] students = new Student[100];
            int numStudents = 0;

            while (true) {
                System.out.println("1. Add a student");
                System.out.println("2. Search for a student");
                System.out.println("3. Display all students");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    if (numStudents == 100) {
                        System.out.println("Cannot add more students, maximum capacity reached.");
                    } else {
                        System.out.print("Enter Reg. No.: ");
                        String regNo = scanner.next();
                        System.out.print("Enter Name: ");
                        String name = scanner.next();
                        System.out.print("Enter Email: ");
                        String email = scanner.next();
                        System.out.print("Enter Phone: ");
                        String phone = scanner.next();

                        Student student = new Student(regNo, name, email, phone);
                        students[numStudents++] = student;

                        System.out.println("Student added successfully.");
                    }
                } else if (choice == 2) {
                    System.out.print("Enter Reg. No. or Name to search: ");
                    String searchString = scanner.next();

                    boolean found = false;
                    for (int i = 0; i < numStudents; i++) {
                        if (students[i].getRegNo().equals(searchString) || students[i].getName().equals(searchString)) {
                            students[i].printDetails();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("No student found with the given Reg. No. or Name.");
                    }
                } else if (choice == 3) {
                    if (numStudents == 0) {
                        System.out.println("No students added yet.");
                    } else {
                        for (int i = 0; i < numStudents; i++) {
                            students[i].printDetails();
                            System.out.println();
                        }
                    }
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Invalid choice, please try again.");
                }

                System.out.println();
            }
        }
    }
}

