import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>(); // setting a students list for filing it with data

        Scanner scanner = new Scanner(System.in);

        // (English) "Please enter information about a student: Name, group number, student id number"
        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");

        while (true) {

            try {
                // (English) "Please enter information about a student (enter "end" to quit the program)"
                System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");

                String input = scanner.nextLine(); // user input

                if (input.equals("end")) {
                    // (English) "Students list"
                    System.out.println("Список студентов:");
                    for (Student student : students) {
                        System.out.println(student.toString());
                    }
                    break;
                } else {
                    String[] parts = input.split(", "); // checking the input
                    String name = parts[0]; // splitting the input in 3 objects fields name, group, id
                    String group = parts[1];
                    String studentId = parts[2];
                    Student student = new Student(name, group, studentId); // adding a student to the list

                    students.add(student);
                }

            } catch (Exception e) {
                System.out.println("wrong input");
            }
        }
    }
}
