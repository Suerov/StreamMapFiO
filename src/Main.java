import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student>studentList=new ArrayList<>();
        studentList.add(new Student(1,"Marsel","Suerov"));
        studentList.add(new Student(2,"name","Suerov"));
        studentList.stream().map(Student::getSurname).forEach(System.out::println);
    }
}