import java.util.Objects;

public class Student {

    private String name;
    private String group;
    private String studentId;

    Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        System.out.println("номер билета должен быть уникальным"); // (English) id must be unique

        Student student = (Student) o;
        // here we check if id is the same for different students than only first student id returns
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return " - " + name + ", " + group + ", " + studentId;
    }
}
