public class Student {
    String name;
    String facultyNumber;
    double grade;

    public Student(String name, String facultyNumber, double grade) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Име: " + name);
        System.out.println("Факултетен номер: " + facultyNumber);
        System.out.println("Оценка: " + grade);
        System.out.println("----------------------");
    }
}
