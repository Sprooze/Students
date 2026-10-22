import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя на студентите: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nВъведете информация за студент " + (i + 1) + ":");

            System.out.print("Име: ");
            String name = scanner.nextLine();

            System.out.print("Факултетен номер: ");
            String facultyNumber = scanner.nextLine();

            System.out.print("Оценка: ");
            double grade = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(name, facultyNumber, grade);
        }

        System.out.println("\nСтуденти, издържали успешно изпита:");
        System.out.println("================================");

        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].grade >= 3) {
                students[i].displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Няма студенти, издържали изпита.");
        }

        scanner.close();
    }
}
