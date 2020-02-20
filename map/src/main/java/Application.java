import java.util.*;

public class Application {

  public static void main(String[] args) {
    Student student1 = new Student("Linda",18);
    Student student2 = new Student("Cindy",19);
    Student student3 = new Student("Mary",19);
    Map<Integer, List<Student>> map = new HashMap<>();
    List<Student> list = new ArrayList<>();
    list.add((student1));
    map.put(student1.getAge(), list);
    List<Student> list2 = new ArrayList<>();
    list2.add(student2);
    list2.add(student3);
    map.put(student2.getAge(), list2);

    Teacher teacher = new Teacher("Bob", map);
    teacher.addStudent(new Student("Ben",19));
    teacher.addStudent(new Student("Solider",20));

    System.out.println(String.format("老师名字为%s，其学生有：", teacher.getName()));
    for (Map.Entry<Integer, List<Student>> entry : teacher.getStudents().entrySet()) {
      for (Student student : entry.getValue()) {
        System.out.println(student.toString());
      }
    }
  }

}
