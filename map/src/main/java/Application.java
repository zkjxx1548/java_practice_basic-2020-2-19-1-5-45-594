import java.util.HashMap;
import java.util.Map;

public class Application {

  public static void main(String[] args) {
    Student student1 = new Student("Linda",18);
    Student student2 = new Student("Cindy",19);
    Student student3 = new Student("Mary",19);
    Map<Student, Integer> map = new HashMap<>();
    map.put(student1, student1.getAge());
    map.put(student2, student2.getAge());
    map.put(student3, student3.getAge());

    Teacher teacher = new Teacher("Bob", map);
    Student student4 = new Student("Ben",19);
    Student student5 = new Student("Solider",20);
    teacher.addStudent(student4);
    teacher.addStudent(student5);

    System.out.println(String.format("老师名字为%s，其学生有：", teacher.getName()));
    for (Object obj : teacher.getStudents().keySet()) {
      System.out.println(obj.toString());
    }
  }

}
