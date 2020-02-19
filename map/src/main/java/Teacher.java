import java.util.HashMap;
import java.util.Map;

public class Teacher {
    private String name;
    private Map<Student, Integer> students;

    public Teacher() {
    }

    public Teacher(String name, Map students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map getStudents() {
        return students;
    }

    public void setStudents(Map students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.put(student, student.getAge());
    }
}
