import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {
    private String name;
    private Map<Integer, List<Student>> students = new HashMap<>();

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

    public Map<Integer, List<Student>> getStudents() {
        return students;
    }

    public void setStudents(Map students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        int age = student.getAge();
        List<Student> list = new ArrayList<>();
        if (students.containsKey(age)) {
            list = students.get(student.getAge());
    }
        list.add(student);
        students.put(age, list);
    }
}
