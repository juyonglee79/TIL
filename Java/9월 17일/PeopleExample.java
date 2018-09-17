import java.util.Scanner;

public class PeopleExample {
    public static void main(String[] arg){
        Student student = new Student("이주용", 123456, 1216);

        System.out.println("이름: "+student.name);
        System.out.println("주민등록번호: "+student.num);
        System.out.println("학번: "+student.studentNumber);
    }
}
